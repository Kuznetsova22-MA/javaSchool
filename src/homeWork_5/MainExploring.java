package homeWork_5;

import java.time.LocalDate;
import java.util.*;

public class MainExploring {
    public static <E> void showList(Collection<E> list) {
        int i = 1;
        for (E l : list) {
            System.out.println(i + ") " + l);
            i++;
        }
        System.out.println("==============================================================");
    }

    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new IdentifierPerson("MARIA", "KUZNETSOVA", 18));
        list1.add(new BillPerson("YANA", "KUZNETSOVA", 48, LocalDate.now(), 89.5));
        list1.add(new Person("IVAN", "IVANOV", 88));
        list1.add(new Person("M***", "K***", 15));
        list1.add(new Person("STEPAN", "IVANOV", 118));
        ExploringPerson exploringPerson = new ExploringPerson();
        System.out.println("max: " + exploringPerson.max(list1));
        System.out.println("midlle: " + exploringPerson.middle(list1));
        showList(exploringPerson.sort(list1));

        List<BillPerson> list2 = new ArrayList<>();
        list2.add(new BillPerson("MARIA", "KUZNETSOVA", 18, LocalDate.now(), 8.5));
        list2.add(new BillPerson("YANA", "KUZNETSOVA", 48, LocalDate.now(), 189.5));
        list2.add(new BillPerson("IVAN", "IVANOV", 88, LocalDate.now(), 89.65));
        list2.add(new BillPerson("M***", "K***", 15, LocalDate.now(), 4));
        list2.add(new BillPerson("STEPAN", "IVANOV", 118, LocalDate.now(), 52.2));
        showList(list2);

        ExploringBillPerson exploringBillPersonPerson = new ExploringBillPerson();
        System.out.println("max: " + exploringBillPersonPerson.max(list2));
        System.out.println("midlle: " + exploringBillPersonPerson.middle(list2));
        showList(exploringBillPersonPerson.sort(list2));
    }
}

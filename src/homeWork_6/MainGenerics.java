package homeWork_6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

public class MainGenerics {
    //3. Вывести список элементов в читабельном виде.
    public static <E> void showList(Collection<E> list) {
        int i = 1;
        for (E l : list) {
            System.out.println(i + ") " + l);
            i++;
        }
        System.out.println("==============================================================");
    }

    public static void main(String[] args) throws MyException {
        List<Person> list1 = new ArrayList<>();
        List<Person> list2 = new ArrayList<>();
        list2 = null;

        list1.add(new IdentifierPerson("MARIA", "KUZNETSOVA", 18));
        list1.add(new BillPerson("YANA", "KUZNETSOVA", 48, LocalDate.now(), 89.5));
        list1.add(new Person("IVAN", "IVANOV", 88));
        list1.add(new Person("M***", "K***", 15));
        list1.add(new Person("STEPAN", "IVANOV", 118));

        //showList(list);
        CollectionsWithPerson yang = new CollectionsWithPerson();
        try {
            System.out.println(yang.youngPerson(list2));
        } catch (MyException e) {
            System.out.println(e.getClass().getSimpleName() + ":  " + e.getMessage());
        }
        try {
            System.out.println(yang.olderPersonIdentification(list2));
        } catch (MyException | NoSuchElementException e) {
            System.out.println(e.getClass().getSimpleName() + ":  " + e.getMessage());
        }

        try {
            System.out.println(yang.olderPersonIdentification(list1));
        } catch (MyException | NoSuchElementException e) {
            System.out.println(e.getClass().getSimpleName() + ":  " + e.getMessage());
        }
    }
}

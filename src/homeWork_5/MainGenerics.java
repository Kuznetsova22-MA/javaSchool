package homeWork_5;

import java.time.LocalDate;
import java.util.*;

public class MainGenerics {
    public static List initializationRandomPerson(int n) {
        List<Person> personList = new LinkedList<>();
        String[] nameMas = {"Ivan", "Alexey", "Maria", "Stepan", "Olga", "Sasha", "Sveta", "Nina", "Tatiana", "Vova", "Daria"};
        String[] surnameMas = {"CHernykh", "Voron", "Veber", "Braun", "Evans", "Grant", "Teilor", "Stoun", "Norman", "Gordon", "Koval", "Ogonek", "Maier", "Verner"};
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            personList.add(new Person(nameMas[random.nextInt(nameMas.length)], surnameMas[random.nextInt(surnameMas.length)], random.nextInt(103) + 17));
        }
        return personList;
    }

    //3. Вывести список элементов в читабельном виде.
    public static <E> void showList(Collection<E> list) {
        int i = 1;
        for (E l : list) {
            System.out.println(i + ") " + l);
            i++;
        }
        System.out.println("==============================================================");
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
     //   Collection<? super IdentifierPerson> list = new ArrayList<>();

        list.add(new IdentifierPerson("MARIA", "KUZNETSOVA", 18));
        list.add(new BillPerson("YANA", "KUZNETSOVA", 48, LocalDate.now(), 89.5));
        list.add(new Person("IVAN", "IVANOV", 88));
        list.add(new Person("M***", "K***", 15));
        list.add(new Person("STEPAN", "IVANOV", 118));

        showList(list);
        CollectionsWithPerson yang = new CollectionsWithPerson();
        System.out.println(yang.youngPerson(list));
        System.out.println(yang.oldPersonIdentification(list));
    }
}

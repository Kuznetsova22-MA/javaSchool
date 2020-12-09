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
        List<Person> list = new ArrayList<>();

        list.add(new IdentifierPerson("MARIA", "KUZNETSOVA", 18));
        list.add(new BillPerson("YANA", "KUZNETSOVA", 48, LocalDate.now(), 89.5));
        list.add(new Person("IVAN", "IVANOV", 88));
        list.add(new Person("M***", "K***", 15));
        list.add(new Person("STEPAN", "IVANOV", 118));

        showList(list);
        CollectionsWithPerson yang = new CollectionsWithPerson();
        try {
            //System.out.println(yang.youngPerson(list));
            System.out.println(yang.oldPersonIdentification(list));
        } catch (MyException | NoSuchElementException e) {
            System.out.println(e.getMessage());
            System.out.println("/////////////");
        }
        finally {
            System.out.println("***************************");
        }

       // System.out.println(yang.oldPersonIdentification(list));
    }
}

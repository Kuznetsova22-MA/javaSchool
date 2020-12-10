package homeWork_6;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CollectionsWithPerson {
    //метод, который будет принимать коллекцию, элементами которой могут быть классы, которые содержат данные о клиенте
    //(т.е. как минимум предыдущие три класса).
    public Person youngPerson(Collection<? extends Person> collection) throws MyException {
        Person yangPerson = null;
        if (collection == null || collection.isEmpty()) {
            throw new MyException("Collection is empty or null");
        } else {
            yangPerson = collection.iterator().next();
            int age = yangPerson.getAge();
            for (Person p : collection) {
                if (p.getAge() < age) {
                    age = p.getAge();
                    yangPerson = p;
                }
            }
        }
        return yangPerson;
    }

    //Создать метод, который принимает коллекцию, элементы которой могут быть только Client и созданный ранее класс с идентификатором.
    public Person olderPersonIdentification(Collection<? extends Person> collection) throws MyException {
        Person olderPerson = null;
        int age = 0;
        if (collection == null || collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty or null");
        } else {
            for (Person p : collection) {
                if (p instanceof BillPerson) {
                    throw new MyException("Collection have element BillPerson");
                } else {
                    if (p.getAge() > age) {
                        age = p.getAge();
                        olderPerson = p;
                    }
                }
            }
            return olderPerson;
        }

    }
}

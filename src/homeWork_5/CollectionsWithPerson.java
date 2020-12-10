package homeWork_5;

import java.util.Collection;
import java.util.Iterator;

public class CollectionsWithPerson {
    //метод, который будет принимать коллекцию, элементами которой могут быть классы, которые содержат данные о клиенте
    //(т.е. как минимум предыдущие три класса).
    public Person youngPerson(Collection<? extends Person> collection) {
        Person yangPerson = null;
        if (collection == null || collection.isEmpty()) {
            return yangPerson;
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
    public Person olderPersonIdentification(Collection<? extends Person> collection) {
        Person olderPerson = null;
        int age = 0;
        if (collection == null || collection.isEmpty()) {
            return olderPerson;
        } else {
            for (Person p : collection) {
                if (p.getAge() > age) {
                    age = p.getAge();
                    olderPerson = p;
                }
            }
            return olderPerson;
        }

    }
}

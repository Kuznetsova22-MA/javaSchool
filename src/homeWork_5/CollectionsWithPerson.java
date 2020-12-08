package homeWork_5;

import java.util.Collection;
import java.util.Iterator;

public class CollectionsWithPerson {
    //метод, который будет принимать коллекцию, элементами которой могут быть классы, которые содержат данные о клиенте
    //(т.е. как минимум предыдущие три класса).
    public Person youngPerson(Collection<? extends Person> collection) {
        Person yangPerson = null;
        if(collection!= null && !collection.isEmpty()) {
            Iterator<Person> iterator = (Iterator<Person>) collection.iterator();
            Person p = iterator.next();
            yangPerson = p;
            int age = p.getAge();
            while (iterator.hasNext()) {
                p = iterator.next();
                if (p.getAge() < age) {
                    age = p.getAge();
                    yangPerson = p;
                }
            }
        }
        return yangPerson;
    }
    //Создать метод, который принимает коллекцию, элементы которой могут быть только Client и созданный ранее класс с идентификатором.
    public Person oldPersonIdentification(Collection<? super IdentifierPerson> collection){
        Person yangPerson = null;
        if(collection!= null && !collection.isEmpty()) {
            Iterator<Person> iterator = (Iterator<Person>) collection.iterator();
            Person p = iterator.next();
            yangPerson = p;
            int age = p.getAge();
            while (iterator.hasNext()) {
                p = iterator.next();
                if (p.getAge() > age) {
                    age = p.getAge();
                    yangPerson = p;
                }
            }
        }
        return yangPerson;
    }
}

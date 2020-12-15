package homeWork_7;

import homeWork_6.Person;

import java.util.Collection;

public class ReflectionTest<T> {
    public Person person;
    private int inn;
    private Collection<T> collection;
    public ReflectionTest(Person person, int inn, Collection<T> collection){
        this.person = person;
        this.inn = inn;
        this.collection = collection;
    }

    public void showList(Collection<T> c) {
        int i = 1;
        for (T l : this.collection) {
            System.out.println(i + ") " + l);
            i++;
        }
    }

}

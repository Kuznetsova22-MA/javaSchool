package homeWork_5;

import java.util.*;

//Один ищет клиента с максимальным количеством букв в имени, и сортирует в выбранном вами порядке по имени и т.д.
public class ExploringPerson implements NewType<Person> {
    @Override
    public Person max(Collection<Person> collection) {
        int maxName = 0;
        Person person = null;
        if (collection != null && !collection.isEmpty()) {
            for (Person p : collection) {
                if (p.getName().length() > maxName) {
                    maxName = p.getName().length();
                    person = p;
                }
            }
        }
        return person;
    }

    @Override
    public double middle(Collection<Person> collection) {
        double middleName = 0;
        if (collection != null && !collection.isEmpty()) {
            for (Person p : collection) {
                middleName += p.getName().length();
            }
            middleName /= collection.size();
        }
        return middleName;
    }

    @Override
    public Collection<Person> sort(Collection<Person> collection) {
        TreeSet<Person> sortCollection = new TreeSet<>(collection);
        return sortCollection;
    }
}

package homeWork_6;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(Person person) {
        this.name = person.name;
        this.surname = person.surname;
        this.age = person.age;
    }

    public Person() {
        this.name = "";
        this.surname = "";
        this.age = 0;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age + "  ";
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return age == person.age &&
                    Objects.equals(name, person.name) &&
                    Objects.equals(surname, person.surname);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public int compareTo(Person person) {
        if (person != null) {
            int result = this.name.compareTo(person.name);
            if (result != 0) {
                return result;
            }
            result = this.surname.compareTo(person.surname);
            if (result != 0) {
                return result;
            }
            return 0;
        } else {
            return 1;
        }
    }

    public void setPerson(Person person) {
        this.surname = person.surname;
        this.name = person.name;
        this.age = person.age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }
    private void setPrivate(int a){}

}

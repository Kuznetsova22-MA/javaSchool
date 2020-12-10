package homeWork_6;

public class IdentifierPerson extends Person {
    private int id;

    public IdentifierPerson(String name, String surname, int age) {
        super(name, surname, age);
        this.id = super.hashCode();

    }

    public IdentifierPerson(Person person) {
        super(person);
        this.id = super.hashCode();
    }

    public int getId(){
        return id;
    }

}

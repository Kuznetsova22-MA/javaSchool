package homeWork_5;

import java.time.LocalDate;

public class BillPerson extends IdentifierPerson {
    private LocalDate date;
    private double sum;

    public BillPerson(String name, String surname, int age, LocalDate date, double sum){
        super(name, surname, age);
        this.date = date; //дата платежа
        this.sum = sum; //сумма платежа
    }
    public BillPerson(Person person, LocalDate date, double sum){
        super(person);
        this.date = date;
        this.sum = sum;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setSum(double sum){
        this.sum = sum;
    }
    public LocalDate getDate(){
        return this.date;
    }
    public double getSum(){
        return this.sum;
    }
}

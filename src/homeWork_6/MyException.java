package homeWork_6;
/*
2.	Реализовать два поля: code, description, инициализация в конструкторе
1.	code целочисленное, при создании инициализировать любое произвольное число
2.	description строка, предназначено для описания бизнес ошибки, при создании инициализировать либым значением,
3.	В конструкторе реализовать вызов родительского конструктора с аргументом message, т.е. у вас один конструктор с тремя параметрами

 */
public class MyException extends Exception {
    private int code;
    private String description;
     public MyException(int code, String description, String message){
        super(message);
        this.code = code;
        this.description = description;
    }
    public MyException(String message){
        super(message);
        this.code = 0;
        this.description = "";
    }
     public int getCode(){
         return this.code;
     }
     public String getDescription(){
         return this.description;
     }
}

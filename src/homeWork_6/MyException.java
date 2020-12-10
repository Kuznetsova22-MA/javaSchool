package homeWork_6;

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

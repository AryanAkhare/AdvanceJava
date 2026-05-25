package ExceptionHandlingAndInput;
class NavinException extends RuntimeException{
    public NavinException(String str){
        super(str);
    }
}

class A{
    public void show() throws ClassNotFoundException{
        
            Class.forName("ThrowsKeyword");
        
    }
}
public class ThrowsKeyword {
    static{
        System.out.println("Class loaded");
    }
    public static void main(String[] args) {
    A obj=new A();
    try{
    obj.show();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    }
}

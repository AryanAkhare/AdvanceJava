package ExceptionHandlingAndInput;

public class TryWithResources {
    public static void main(String[] args) {
        try{
int j=18/0;
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Code works");
            //generally used to close the resources.
            
        }
    }
}

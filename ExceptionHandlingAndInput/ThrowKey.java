package ExceptionHandlingAndInput;

public class ThrowKey {
    public static void main(String[] args) {
        int j=0;
        int i=14;
        String str=null;
        int arr[]=new int[5];

        try{
            System.out.println(i/j);
            if(j==0){
                throw new ArithmeticException("Dont div by zero.");
            }
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("Default output.");
        }
        catch(Exception e){
            System.out.println("Other error : "+ e);
        }
        System.out.println(j);
        System.out.println(str);
    }
}

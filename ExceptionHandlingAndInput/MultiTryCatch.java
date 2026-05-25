package ExceptionHandlingAndInput;

public class MultiTryCatch {
    public static void main(String[] args) {
        int j=1;
        int i=14;
        String str=null;
        int arr[]=new int[5];

        try{
            System.out.println(i/j);
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Stay in limit");
        }
        catch(Exception e){
            System.out.println("Other error : "+ e);
        }
        System.out.println(j);
        System.out.println(str);
    }
}

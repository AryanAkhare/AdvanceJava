package Enum;


enum Status{
    Running , Failed , Pending , Success;
}


public class Demo{
    public static void main(String[] args) {
        

        // Status s = Status.Running; //only accept 4 codes applied above
        // System.out.println(s); //prints Running

        //.ordinal is where we get values
        Status s1[]=Status.values();
        for(Status x:s1){
            System.out.println(x+" " +x.ordinal()+ " ");
        }
    }
}
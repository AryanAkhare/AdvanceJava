package ExceptionHandlingAndInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class BufferReaderAndScanner {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter a number : ");
        // int num=System.in.read(); //gives ascii value //reads only 1 character
        // System.out.println(num);


        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader bf=new BufferedReader(in);

        // int num=Integer.parseInt(bf.readLine());
        // System.out.println(num);

        System.out.println("Enter : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);

    }
}

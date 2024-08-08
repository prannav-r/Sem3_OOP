//Java program to calculate the factorial of a number.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = myobj.nextInt();
        myobj.close();  //closing scanner object to prevent resource leak.
        int res=fact(n);
        System.out.println("Factorial of "+n+" is "+res);
    }
    static int fact(int n){
        if (n==1) {
            return n;
        }
        else{
            return n*fact(n-1);
        }
    }
}
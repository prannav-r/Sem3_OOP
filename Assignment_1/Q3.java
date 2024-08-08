//Java program to implement a simple calculator.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        while(true){
            System.out.print("Main Menu\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit\nEnter your Choice : ");
            int ch = obj.nextInt();
            System.out.println("Enter the numbers : ");
            int a = obj.nextInt();
            int b = obj.nextInt();
            if (ch==1){
                System.out.println("Result = "+(a+b));
            }
            else if (ch==2) {
                System.out.println("Result = "+(a-b));
            }
            else if (ch==3){
                System.out.println("Result = "+(a*b));
            }
            else if (ch==4){
                System.out.println("Result = "+(a/b));
            }
            else if(ch==5){
                obj.close();
                return;
            }
            else{
                System.out.println("Enter a valid choice!");
            }
        }
    }
}
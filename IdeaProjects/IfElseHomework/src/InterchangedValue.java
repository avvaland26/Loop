import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Scanner;

//input any two numbers printing swapping value
public class InterchangedValue
{
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        int num2  = scanner.nextInt();
        System.out.println("Before swapping:   num1 = " + num1);
        System.out.println("Before swapping:  num2 ="  + num2);
       swap(num1, num2);
    }
        public static void swap (int num1 , int num2)//swap method to hold number
        {
           int temp = num1; //temp holding variable
                num1 = num2;//variable after swapping num1 is 40
                num2 = temp;//variable after swapping num2 is 20
                System.out.println("After swapping num1 =" +num1);
                System.out.println("After swapping  num2 =" +num2);

        }

















}

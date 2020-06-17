import java.util.Enumeration;
import java.util.Scanner;
//A program to five digit number then count odd number and find sum of them
public class OddEven {
    public static void main(String[] args) {
       int  sum = 0, i = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);//creating scanner
        System.out.print("Enter any number :");
         int n = scanner.nextInt();

            //using for loop
         for (i = 1; i <= n; i++)
         {
             if ((i % 2) != 0)
             {
                 sum += i;


             }

         }
            System.out.println("\nSum of odd  numbers from 1 to " +n+ " is : " + sum);

    }
}
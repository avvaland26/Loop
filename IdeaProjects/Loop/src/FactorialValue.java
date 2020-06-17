import java.util.Scanner;
//A program to find the factorial value of any number
public class FactorialValue {
    public static void main(String[] args) {
        int number = 5;//it is number to calculate factorial
        long fact = 1;

        Scanner scanner = new Scanner(System.in);//creating scanner
        System.out.println("Enter any number :");
        int num = scanner.nextInt();

       //using for loop
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}




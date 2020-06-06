import java.util.Scanner;//import the scanner class
public class AddSubMultiDivision
{
//this program to input user put any two numbers (+ - * /)according their symbol

    public static void main(String[] args)//main method
    {
        int a, b, ans;//to create variables we need integer
        char s;//s is variable
        Scanner scanner = new Scanner(System.in);//to create scanner object
        System.out.println("Enter one members");
        a = scanner.nextInt();//creating variable for letter
        System.out.println("Enter another number");
        b = scanner.nextInt();//creating variable for letter
        System.out.println("Enter symbol (+, -, *, /,): ");//request for symbol
        s = scanner.next().charAt(0);
        System.out.println("Ans =" + (a+b));//printing statement(output)

        System.out.println("Ans =" + (a-b));

        System.out.println("Ans =" + (a*b));

        System.out.println("Ans =" + (a/b));

    }
}






















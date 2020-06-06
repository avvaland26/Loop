import java.util.Scanner;//import the scanner class
//this program giving average of five numbers
public class AverageNumber
 {
    public static void main(String[] args)//main method
    {
        Scanner in = new Scanner(System.in);//to create scanner object

        System.out.println("Input first number:");
        int num1 = in.nextInt();//to create variable number

        System.out.println("Input second number");//to create variable second number
        int num2 = in.nextInt();

        System.out.println("Input third number");
        int num3 = in.nextInt();

        System.out.println("Input forth number");
        int num4 = in.nextInt();

        System.out.println("Input fifth number");
        int num5 = in.nextInt();

        System.out.println("Average of five number is:" + (num1 + num2 + num3 + num4 + num5)  / 5);
        // printing out all number average

    }
 }

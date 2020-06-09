import java.util.Scanner;

public class PositiveNegativeOrZero {

    public static void main(String[] args)//main method
    {
        int num;//number is variable
        System.out.println("Enter a number:");//printing out number
        Scanner scanner = new Scanner(System.in);//creating object
        num = scanner.nextInt();
        int number = -26;

        if (num > 0)
        {
            System.out.println("Given number is positive integer:");
        }
        else if (num < 0)
        {
            System.out.println("Given number is a negative integer");
        }
        else
        {
            System.out.println("Given number is zero");
        }

        }

    }





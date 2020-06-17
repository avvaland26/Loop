import java.util.Scanner;
//A program for user enter number till the user wants and display count of negative positive and zero
public class PositiveNegativeZero
{
    public static void main(String[] args)
    {

        int number, positive = 0, negative = 0, zero = 0;
        char choice;
        Scanner scanner = new Scanner(System.in);//creating scanner

     //using do while loop
        do {
            System.out.println("Enter a number :");//user needs to enter number
            int num = scanner.nextInt();
            if (num > 0)
            {
                positive++;
            } else if (num < 0)
            {
                negative++;
            } else
                {
                zero++;
            }

            System.out.println("Do you want to Continue(y/n)? ");
             choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');


        System.out.printf("\nPositive Numbers :%d\nNegative Numbers :%d\nZero Numbers :%d", positive, negative, zero);

    }

    }











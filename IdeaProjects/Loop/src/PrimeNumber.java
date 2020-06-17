import java.util.Scanner;
//A programme to  input any number and check it is prime number or not
public class PrimeNumber
{
    public static void main(String[] args)
    {
        int i , num;

        Scanner scanner = new Scanner(System.in);//importing scanner
        System.out.println("Enter any number :");//take input from user
        num = scanner.nextInt();

      //using loop for prime number
        for(i = 2; i <= (num / 2); i++) {

            if((num % i) == 0) {
                i = num;
                break;
            }
        }

        if(i == num) {
            System.out.println("\n" + num + " is not a prime number.");

        } else {
            System.out.println("\n" + num + " is a prime number.");
        }
    }

}










import java.util.Scanner;
//A program to input any number and check it is armstrong or not
public class ArmstrongNumber {
    public static void main(String[] args) {
        //variables to check number armstrong
        int num, num1, lastDigit, firstdigit;
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check : ");
        num = scanner.nextInt();

        num1 = num;

        // Find total digits in given number
        firstdigit = (int) Math.log10(num) + 1;

        while(num > 0) {

            lastDigit = num % 10;

            sum = sum + Math.round(Math.pow(lastDigit, firstdigit));


            num = num / 10;
        }
          //check for armstrong
        if(num1 == sum)
        {
            System.out.println("\n" + num1 + " is ARMSTRONG NUMBER");

        }
        else
            {
            System.out.println("\n" + num1 + " is NOT ARMSTRONG NUMBER");
           }

    }

}





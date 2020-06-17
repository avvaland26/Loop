import java.util.Scanner;//using scanner

//A  program is  to find sum of first and last digit of a number by using  while loop

public class FirstLastDigit
{
    public static void main(String[] args)//main method
    {
        int num, sum=0, firstDigit, lastDigit;//creating variable


        Scanner scanner = new Scanner(System.in);//creating scanner for number
        System.out.println("Enter number :");//user needs to enter number
        num = scanner.nextInt();
        lastDigit = num % 10;//findin last digit
        firstDigit = num;//Copy num to first digit

        while(num >= 10)/* using while loop find first digit by 10 until first digit left */
        {
            num = num / 10;
        }
        firstDigit = num;
        sum = firstDigit + lastDigit;// Find sum of first and last digit
        System.out.printf("Sum of first and last digit = %d", sum);
    }

    }


import java.util.Scanner;
// A program to check five digit number then find sum of each digit and odd even number
public class Sum
{

    public static void main(String[] args)
    {
        int i, num, odd_sum = 0, even_sum = 0;
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of num\n");
        num = scanner.nextInt();
        for (i = 1; i <= num; i++)
        {
            if (i % 2 == 0)
                even_sum = even_sum + i;
            else
                odd_sum = odd_sum + i;
        }
        System.out.printf("Sum of all odd numbers  = %d\n", odd_sum);
        System.out.printf("Sum of all even numbers = %d\n", even_sum);

    }
}
import java.util.Scanner;
//A program to check five digit number and then reverse them
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = scanner.nextInt();
      //it is the number to be checked
        int i = num;
        int reverse = 0;
        while (i!= 0) {
            reverse = (reverse * 10) + (i % 10);
            i /= 10;
        }
        System.out.println("\nreverse of " + num + " : " + reverse);
    }
}

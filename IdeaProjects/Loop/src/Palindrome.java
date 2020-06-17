import java.util.Scanner;
//A programme to check input any number and check it is palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        int num, temp, reverse = 0;
      //using a variable to be checked for palindrome
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");// Take input from user
        num = scanner.nextInt();
        temp = num;
       //reversed integer is stored in reverse
        while(temp != 0) {

            reverse = (reverse * 10) + (temp % 10);

            temp /= 10;
        }

        // Check for palindrome
        if(reverse == num) {
            System.out.println("\n" + num + " is a palindrome.");
        } else {
            System.out.println("\n" + num + " is not a palindrome.");
        }
    }

}







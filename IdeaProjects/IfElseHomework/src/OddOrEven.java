import java.util.Scanner;

public class OddOrEven // class name
 {
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in); //variable of object type
        System.out.println(" Enter a number: ");//printing out condition
        int number = scanner.nextInt(); //variable int type
        String evenOdd = (number % 2 == 0) ? "even" : "odd"; //using ternary operator
        System.out.println(number + "  is  " + evenOdd);// printing out number


    }
 }

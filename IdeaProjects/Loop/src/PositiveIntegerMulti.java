import java.util.Scanner;
//A programme to check input positive integer and print the multiplication table
public class PositiveIntegerMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
      //using for loop to get each number tables
        for (int i = 0; i < 100 ; i++) {
            System.out.println(num + " x " + (i+1) + "= " + (num * (i+1)));
        }

    }
}

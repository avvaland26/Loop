import java.util.Scanner;
//A program is to printing table of multiplication
public class Multiplication {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);//creating scanner
        System.out.println("Enter number to print table :");
        int num = scanner.nextInt();
         //printing table number
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.printf("%-2d * %-2d = %-3d  | ",j,i,(i*j));

            }
            System.out.println();

        }


    }

}

import java.util.Scanner;//import scanner
//a program for calculating any two numbers by any operator
public class Operator
{
    public static void main(String[] args) //main method
    {


        Scanner scanner = new Scanner(System.in);//creating object

        System.out.println("Enter 1st number: ");
        int a = scanner.nextInt();// creating variable for number
        System.out.println("Enter 2nd number: ");
        int b = scanner.nextInt();//creating variable for another number
        System.out.println("Enter any operator  ");
        char c = scanner.next().charAt(0);//creating variable for character


                switch (c) {
                    case '+':
                        System.out.println("Addition of " + a + " and " + b + " : " + (a + b));
                        break;

                    case '-':
                        System.out.println("subtraction of " + a + " and " + b + " : " + (a - b));
                        break;

                    case '*':
                        System.out.println("multiplication of " + a + " and " + b + " :" + (a * b));
                        break;

                    case '/':
                        System.out.println("division of " + a + " and " + b + " :" + (a / b));
                        break;

                    case '%':
                        System.out.println("modulo of " + a + " and " + b + " :" + (a % b));
                        break;

                    default:
                        System.out.println("Please enter '+','-','*', '/', '%, operator only");


                }


    }
}

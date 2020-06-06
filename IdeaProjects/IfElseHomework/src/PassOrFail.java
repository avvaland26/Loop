
import java.util.Scanner;//import the scanner
// a program for students result in all subject with percentage and grade
public class PassOrFail
{
    public static void main(String[] args)// main method
    {
        Scanner scanner = new Scanner(System.in);//allow user input
        System.out.println("Please enter student name:");//this is comment
        String name = scanner.nextLine(); //define name as a string
        System.out.println("Please enter your roll number:");
        int number = scanner.nextInt(); //variable for number
        System.out.println("Please enter your maths marks:");
        int maths = scanner.nextInt(); //request maths marks
        System.out.println("Please enter your English marks:");
        int eng = scanner.nextInt(); //request english marks
        System.out.println("Please enter your science marks:");
        int sci = scanner.nextInt(); //request science marks

        int total = maths + eng + sci; //marks is variable int type
        double percentage = total/3;//double is integer for total subject
        System.out.println("Total marks = " +total);//checking out total marks of subject
        System.out.println("Percentage = " + percentage);//checking out percentage

        if (percentage < 35)
        {
            System.out.println("you have Fail ");//this is output as comments
        }
        else if (percentage <= 35 && percentage > 50)
        {
           System.out.println("you have pass");
        }
        else if (percentage <= 50 && percentage > 60)
        {
          System.out.println("you have pass");
        }
        else if (percentage <= 60 && percentage > 80)
        {
            System.out.println("you have pass");
        }





    }
 }

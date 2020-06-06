import java.util.Scanner;
//a program is for student percentage and grade
public class PercentageAndGrade
{
    public static void main(String[] args)//main method
    {
        Scanner scanner = new Scanner(System.in);//creating object
        System.out.println("Enter student Name:");//printing out name
        String name = scanner.nextLine();//variable string
        System.out.println("Enter your roll number:");
        int number = scanner.nextInt();//variable number

        System.out.println("Please enter your English marks: ");
        int english = scanner.nextInt();//variable subject

        System.out.println("Please enter your Maths marks: ");
        int maths = scanner.nextInt();//variable subject

        System.out.println("Please enter your Science marks: ");
        int science = scanner.nextInt();//variable subject



        int total = english + maths + science ;
        double percentage = total/3 ;//all subject total
        System.out.println("Total marks = " + total);
        System.out.println("Percentage = " + percentage);

        if (percentage >35)
        {
            System.out.println("fail");
        }
        else if (percentage >= 40 && percentage < 50)
        {
            System.out.println("C grade");
        }
        else if (percentage >= 50 && percentage < 60)
        {
            System.out.println("B grade");
        }
        else if (percentage >= 60 && percentage < 70)
        {
            System.out.println("A grade");
        }
        else if (percentage >= 70 && percentage < 80)
        {
            System.out.println("A+");
        }


    }

}

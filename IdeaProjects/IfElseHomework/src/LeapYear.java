import java.util.Scanner;//Import the scanner class

public class LeapYear
  {
    public static void main(String[] args)//main method
    {
        Scanner scanner = new Scanner(System.in);//to create a scanner object
        System.out.println("Enter any year: ");
        //printing the years
     int year = scanner.nextInt();//Read user input
     if (( year % 4 == 0))//&& (year % 100 != 0)) || (year % 400==0))
        {
            System.out.println("Leap year");//printing leap year
        }
        else
            {
               System.out.println("common year");//printing leap year
            }


     }
  }
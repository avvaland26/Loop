import java.util.Scanner;
//a program for input number printing weekdays accordingly
public class NameOfTheWeek
{

  public static void main(String[] args)//main method
  {
      Scanner scanner = new Scanner(System.in);//creating objects
      System.out.println("Enter weekday days number (1-7):");//printing out weeks days
      int weekday = scanner.nextInt();//variable for weekday

    if (weekday == 1)
    {
        System.out.println("monday");

    }
    else if (weekday == 2)
    {
       System.out.println("Tuesday");
    }
     else if (weekday == 3)
     {
        System.out.println("Wednesday");
    }
     else if (weekday == 4)
     {
         System.out.println("Thursday");
    }
     else if (weekday == 5)
     {
       System.out.println("Friday");
     }
     else if (weekday == 6)
     {
       System.out.println("Saturday");
     }
     else if (weekday == 7)
     {
       System.out.println("Sunday");
     }

  }

}

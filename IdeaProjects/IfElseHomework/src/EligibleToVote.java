import java.util.Scanner;//Import the scanner class
//this program is check for eligibility for vote
public class EligibleToVote
{
    public static void main(String[] args)//main method
    {

        int age; //variable
        Scanner scanner =new Scanner(System.in);//to create scanner object
        System.out.print("Enter your age:");//to create variable for age
        age=scanner.nextInt();//read user input
        if(age>=18)

              System.out.println("You are eligible to vote.");
          else
              System.out.println("your not eligible to vote.");









    }
}

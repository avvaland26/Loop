import java.util.Scanner;//import the scanner class
//this program is city name according to alphabet
public class AlphabetCityName
{
    public static void main(String[] args) //main method
    {
        String letter = ("A, B, C, D, E, F,");//variable string for letters

        Scanner scanner = new Scanner(System.in);//to create scanner object
        System.out.println("Enter alphabet A to Z :");//request alphabet a to z
        letter = scanner.next();//variable for letter

         if (letter == "A")
         {
            System.out.println("Amritser");//printing cities name
         }
         else if ( letter == "B")
         {
             System.out.println("Birmingham");
         }
         else if (letter == "C")
         {
            System.out.println("Cardiff");
         }
        else if(letter == "D")
        {
            System.out.println("Delhi");
        }
        else if (letter == "E")
        {
            System.out.println("edinburgh");
        }
        else if (letter == "F")
           {
               System.out.println("Florence");
           }
         else
         {
             System.out.println("invalid entry");
         }

    }
 }

import java.util.Scanner;//import the scanner class
//this program is find out 0-9 or alphabet or symbol by input any number

public class AlphabetOrSymbol
{

    public static void main(String[] args)//main method
    {

        Scanner scanner = new Scanner(System.in);//to create scanner object

        System.out.println(" Enter any character: ");//to create character
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) //creating condition
        {
            System.out.println(ch + " is a Alphabet ");//printing out alphabet
        }
        else if (ch >= '0' && ch <= '9')
        {
            System.out.println(ch + " is a Digit ");//printing out digits

        }
        else
        {
            System.out.println(ch + " is a special symbol ");//printing out symbol
        }








    }
}

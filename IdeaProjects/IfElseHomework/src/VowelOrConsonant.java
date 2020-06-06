import java.util.Scanner;//import scanner
//a program for input an alphabet expect them in vowel or consonant
public class VowelOrConsonant {

    public static void main(String[] args)//main method
    {
        Scanner scanner = new Scanner(System.in);//creating object
        System.out.println("Enter a alphabet:");//printing out alphabet
        char c = scanner.next().charAt(0);//creating object with long character
        if ((c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u')
                 || (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'))
        {
          System.out.println(c + " is a vowel.");
        }
        else
            {
            System.out.println((c + " is a consonant."));
        }



    }
}

import java.util.Scanner;
//a program is input any alphabet in uppercase and print in lowercase
public class UppercaseLowercase {

    public static void main(String[] args)//main method
    {
        Scanner users_input = new Scanner(System.in);//creating object
        char ch;//variable
        int temp;//variable
        System.out.println("Enter a character in uppercase:");//printing out character
        ch=users_input.next() .charAt(0);

        temp= (int)ch;//variable
        temp=temp+32;//variable
        ch = (char)temp;
        System.out.println("Lower case is :" +ch);







    }
}

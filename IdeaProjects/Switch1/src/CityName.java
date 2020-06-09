//a program for user put any alphabet it will print city name
public class CityName
{
    public static void main(String[] args)//main method
    {
        char ch = 'C';//Declaring  String variable
        switch (ch) //using String in switch expression
        {
            case 'A':
                System.out.println("Amritsar");//printing out cities name
                break;
            case 'B':
                System.out.println("Bombay");
                break;
            case 'C':
                System.out.println("Cardiff");
                break;
            case 'D':
               System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Edinburgh");
                break;
            case 'F' :
                System.out.println("Florance");
                break;
           default:
                System.out.println("Invalid entry");
                break;
        }

    }

}

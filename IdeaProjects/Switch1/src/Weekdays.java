public class Weekdays
//a program is printind day of the week by using number
{
    public static void main(String[] args) {
   int weekdays= 1;//specifying weeks numbers
   //switch statement
   switch (weekdays){
       //case statement within the switch block

       case 1:
           System.out.println("sunday");
       break;
       case 2:
           System.out.println("monday");
       break;
       case 3:
           System.out.println("tuesday");
       break;
       case 4:
           System.out.println("wednesday");
       break;
       case 5:
           System.out.println("thursday");
       break;
       case 6:
           System.out.println("friday");
       break;
       case 7:
           System.out.println("saturday");
       break;

       default:
           System.out.println("invalid choice");

   }


    }
}

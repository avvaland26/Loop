import java.awt.geom.RoundRectangle2D;
import java.util.Scanner;//import the scanner class

public class SalesAndCommission
{
   public static void main(String[] args)//main method for sales id, name, and commission
   {
       Scanner scanner = new Scanner(System.in);//to create the scanner object
       double commissionRate;//variable double number (integer)
       double TotalSales, commission;//varible foe double number (integer)
       System.out.println("Please enter your sales Id");//printing statement
       scanner.nextInt();//variable number
       System.out.println("Please enter your name");
       scanner.next();//variable name
       System.out.println("Please enter your Basic Salary");
       int Salary = scanner.nextInt();//variable long number (integer)
       System.out.println("Please enter your total sales");
       TotalSales = scanner.nextDouble();
       if (TotalSales >= 50000)
           commissionRate = 0.35;
       else if (TotalSales >= 49999 && TotalSales <= 30000)
               commissionRate = 0.20;
       else if (TotalSales >= 29999 && TotalSales <= 20000)
                commissionRate = 0.10;
       else if (TotalSales >= 19999 && TotalSales <= 10000)
                 commissionRate = 0.05;
       else
             commissionRate = 0.02;
         commission = commissionRate * TotalSales;
         System.out.println("The total Salary and Commission is:" + '£' +  (Salary + commission));


















   }
}

import java.util.Scanner;//import the scanner class
//this program is find the gross salary
public class GrossAndBasicSalary
{
    public static void main(String[] args)//main method
    {
        float basic_salary,hra,da,ta,pf,gross_salary;//creating object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your sales id  ");
        scanner.nextInt();//variable for id
        System.out.println("Please enter your name");
        scanner.next();//variable for name
        System.out.println("please enter your basic salary");
        int salary = scanner.nextInt();//variable for salary

        hra =   ((salary* 10)/ 100);//working out salary by using this hra, ta,da,pf
        ta = ((salary* 8) / 100);
        da = (salary* 9) / 100;
        pf = (salary* 20) / 100;
         System.out.println( "gross salary  : " + '£' +  (salary + hra + ta + da - pf));









    }

}

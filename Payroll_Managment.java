import java.util.*;
public class Payroll_Managment {
    static int calculateBasicSalary(String type,int hoursWorked)
    {
        if(type.equals("FullTime"))
        {
            return (500*hoursWorked);
        }
        else if(type.equals("PartTime"))
        {
            return (250*hoursWorked);
        }
        else if(type.equals("Contract"))
        {
            return (350*hoursWorked);
        }
        return 0;
    }
    static int calculateBasicSalary(int hoursWorked)
    {
        return (300*hoursWorked);
    }
    static double calculateHRA(double basic)
    {
        return basic * 0.20;
    }
    static double calculateDA(double basic)
    {
        return basic * 0.15;
    }
    static double calculatePF(double basic)
    {
        return basic * 0.12;
    }
    static double calculateTax(double Gross)
    {
        if(Gross>100000)
        {
            return Gross*0.20;
        }
        else if(Gross<100000&&Gross>50000)
        {
            return Gross*0.10;
        }
        else if(Gross<50000)
        {
            return 0.0;
        }
        return 00.0;
    }
    static double calculateNetSalary(double gross,double tax,double PF)
    {
        return (gross-tax-PF);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Type Of Work");
        String type=sc.nextLine();
        System.out.println("Enter the Hours Worked");
        int hours=sc.nextInt();
        int Basic_Sal=0;
        if(type==null)
        {
            Basic_Sal=calculateBasicSalary(type,hours);
        }
        else{
            Basic_Sal=calculateBasicSalary(hours);
        }

        double HRA=calculateHRA(Basic_Sal);
        double DA=calculateDA(Basic_Sal);
        double gross=Basic_Sal+HRA+DA;
        double PF=calculatePF(Basic_Sal);
        double tax=calculateTax(gross);
        double Net=calculateNetSalary(gross,tax,PF);

        System.out.println("Basic Salary:"+Basic_Sal);
        System.out.println("HRA Value :"+HRA);
        System.out.println("DA Value:"+DA);
        System.out.println("Gross Value:"+gross);
        System.out.println("PF Value:"+PF);
        System.out.println("Tax Value:"+tax);
        System.out.println("Net Salary:"+Net);
    }
}

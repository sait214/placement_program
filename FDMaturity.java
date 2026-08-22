import java.util.*;
public class FDMaturity{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Principal Amount");
        double principal=sc.nextDouble();
        System.out.println("Enter The Rate");
        double rate=sc.nextDouble();
        System.out.println("Enter The Duration in Years");
        int years=sc.nextInt();
        double interest=0;

        for(int i=0;i<years;i++)
        {
            interest=(principal*rate*1)/100;
            System.out.println("For "+(i+1)+"st Year:-Opening Balance:="+principal+"\tInterest:="+interest+"\tClosing Balance="+(principal+interest));
            principal=principal+interest;
        }
        
        sc.close();
    }
}
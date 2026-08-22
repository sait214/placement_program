import java.util.*;
public class Shipping_calculator {
    static double calculateShipping(double weight)
    {
        return (50.00+(weight*10));
    }
    static double calculateShipping(double weight,int distance)
    {
        return (50.00+(weight*10)+(distance*2));
    }
    static double calculateShipping(double weight,int distance,boolean isExpress)
    {
        if(isExpress){
            return (50.00+(weight*10)+(distance*2)+100);
        }
        return (50.00+(weight*10)+(distance*2));
    }

    static double calculateCartTotal(double[] itemPrices)
    {
        double total=0;
        for(double i:itemPrices) total+=i;
        return total;
    }
    static double applyCoupon(double total,String Coupon)
    {
        if(Coupon.equals("20% Off"))
        {
            return total-(total*20/100);
        }
        return total;
    }
    static void generateInvoice(double total_ship_value,double total_product_value,double final_calculated_value,double discount)
    {
        System.out.println("Total Shipping Charges  "+total_ship_value);
        System.out.println("Total Product Charges   "+total_product_value);
        System.out.println("Total Discount          "+discount);
        System.out.println("Total Value Of Products "+final_calculated_value);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of Products");
        int n=sc.nextInt();
        double[] product_prices=new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Price of All Prices One By One:");
            product_prices[i]=sc.nextInt();
        }
        System.out.println("Enter the Weight Of All Products Combined");
        double weight=sc.nextDouble();
        System.out.println("Enter the Distance");
        int dis=sc.nextInt();
        System.out.println("Is it a Express Delivery");
        boolean isexp=sc.nextBoolean();
        System.out.println("Enter Coupon if available Otherwise enter No");
        sc.nextLine();
        String coup=sc.nextLine();

        double total_ship_value=0;
        if(dis>0)
        {
            if(isexp)
            {
                total_ship_value=calculateShipping(weight,dis,isexp);
            }
            else{
                total_ship_value=calculateShipping(weight,dis);
            }
        }
        else{
            total_ship_value=calculateShipping(weight);
        }

        //Passing the Array Of Product Value to Total Cart value 
        double total_product_value=calculateCartTotal(product_prices);

        //Passing Value to the Apply Coupon
        double final_calculated_value=applyCoupon((total_ship_value+total_product_value),coup);
        double discount = (total_ship_value + total_product_value) - final_calculated_value;

        //Last Call To the Invoice Method
        generateInvoice(total_ship_value,total_product_value,final_calculated_value,discount);
    }
}

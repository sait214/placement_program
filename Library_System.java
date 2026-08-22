import java.util.*;
class Library_System{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        
        int total_fine=0;
        int books_processed=0;

        while(true)
        {
            System.out.println("Enter Book Id");
            int book_id=sc.nextInt();
            System.out.println("Enter Due Date");
            int due_date=sc.nextInt();
            System.out.println("Enter Return Date");
            int ret_date=sc.nextInt();
            if(ret_date>due_date)
            {
                int fine=(ret_date-due_date)*5;
                total_fine=total_fine+fine;
                System.out.println("The Fine For the Late Issue is:"+fine);
                books_processed++;
                System.out.println("Thank You....");
                System.out.println("Your Book Is Returned Successfully||Book Id:"+book_id);
                System.out.println("Do You Want to Return Another Book?(y/n)");
                char ch=sc.next().charAt(0);
                if(ch=='n'||ch=='N')
                {
                    break;
                }
            }
            else{
                System.out.println("Your Book Is Returned Successfully, No fine was calculated||Book Id:"+book_id);
                books_processed++;
                System.out.println("Thank You....");
                System.out.println("Do You Want to Return Another Book?(y/n)");
                char ch=sc.next().charAt(0);
                if(ch=='n'||ch=='N')
                {
                    break;
                }
            }
        }
        System.out.println("Total Books Processed:"+books_processed);
        System.out.println("Total Fine Calculated for your Books:"+total_fine);
        System.out.println("Thank For...!");
        sc.close();
    }
}
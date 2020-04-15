import java.util.Scanner;

public class calculation {
    public static void main(String [] args)
    {
       int x;
       int y;
       int sum;
       int product;
       String b;
       String c;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a number:");
       x = input.nextInt();
       System.out.println("Enter another number:");
       y = input.nextInt();
       input.nextLine();
       sum = x + y;
       product = x * y;
       System.out.println("Sum :" + sum);
       System.out.println("Product :" + product);
       System.out.println("Square : " + x + "= " + x*x);
       System.out.println("Square : " + y + "= " + y*y);
       System.out.println("Input: ");
        b = input.nextLine();
       System.out.println("Input: ");
        c = input.nextLine();
       System.out.println(b + c );







    }
}

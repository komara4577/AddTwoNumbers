//By Kevin O'Mara
import java.util.Scanner;
public class AddTwoNumbers{
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter first number:");
      int x = input.nextInt();
      
      System.out.print("Enter second number:");
      int y = input.nextInt();
      
      System.out.print("The sum is: " + (x + y));
   }
}
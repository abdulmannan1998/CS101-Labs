import java.util.Scanner;

/**
 * __Lab 04 Part d__
 * @author __Abdul Mannan__
 * @v 1.0 __31/10/2018__
 */

public class Lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // declare variables......again
      String ch;
      int width, x = 1, count = 1;
      
      // prompts for inputs
      System.out.println("Enter a single character");
      ch = scan.next();
      
      System.out.println("Enter an integer");
      width = scan.nextInt();
      
      while( count <= width)
      {
         x = 1;
         while( x <= count )
         {
            System.out.print(ch);
            x++;
         }
         System.out.println(" ");
         count++;
      }
      
      System.out.println(" ");
      
      // the copy paste part
      double d;
      d = 0.1;
      while ( d < 1.0 )
      {
         System.out.println( d);
         d = d + 0.1;
      }
      System.out.println( d + " <- final value after loop!");
      
      
   }
}
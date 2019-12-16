import java.util.Scanner;

/**
 * __Lab 04 Part c__
 * @author __Abdul Mannan__
 * @v 1.0 __31/10/2018__
 */

public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // declaring the needed variables
      int max = 0, min = 100, value = 0, sum = 0, count = -1;
      double avg;
      
      // working of the program
      while ( value >= 0 )
      {
         value = scan.nextInt();
         if ( value >= 0 )
         {
            max = Math.max(max, value);
            min = Math.min(min, value);
            sum = sum + value;
         }
         count++;
      }
         
      avg = (double)sum / (double)count;
      
      System.out.println("The max value is: " + max);
      System.out.println("The min value is: " + min);
      System.out.print("The average is: ");
      System.out.format( "%.2f%n", avg );
   }
}
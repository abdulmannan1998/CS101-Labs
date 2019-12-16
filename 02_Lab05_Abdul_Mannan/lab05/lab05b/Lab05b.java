import java.util.Scanner;

/**
 * __Lab 05 Part B__
 * @author __Abdul Mannan__
 * @v 1.0 __06/11/2018__
 */

public class Lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // declare variables
      int rows, cols, count = 0;
      String out = " ";
      
      //prompts and inputs
      System.out.println("What number of rows do you want?");
      rows = scan.nextInt();
      System.out.println("What number of coloumns do you want?");
      cols = scan.nextInt();
      
      //output 1
      for ( int x = 1; x <= rows; x++ )
      {
         for( int y = 1; y <= cols; y++ )
         {
            out = Integer.toString(x) + "," + Integer.toString(y);
            System.out.print(out);
            for( int j = 0; j <= 6 - out.length(); j++ )
            {
              System.out.print(" "); 
            }
         }
         System.out.println(" ");
      }
      System.out.println(" ");
      
      //output 2
      for ( int x = 1; x <= rows; x++ )
      {
         for( int y = 1; y <= cols; y++ )
         {
            out = Integer.toString( x * y );
            System.out.print(out);
            for( int j = 0; j <= 6 - out.length(); j++ )
            {
              System.out.print(" "); 
            }
         }
         System.out.println(" ");
      }
      System.out.println(" ");
      
      //output 3
      for ( int x = 1; x <= rows; x++ )
      {
         for( int y = 1; y <= cols; y++ )
         {
            out = Integer.toString(count);
            System.out.print(out);
            for( int j = 0; j <= 6 - out.length(); j++ )
            {
              System.out.print(" "); 
            }
            count++;
         }
         System.out.println(" ");
      }
      System.out.println(" ");
      
      //output 4
      for ( int x = 1; x <= rows; x++ )
      {
         out = Integer.toString(x);
         System.out.print(out);
         for( int j = 0; j <= 6 - out.length(); j++ )
         {
            System.out.print(" "); 
         }
         for( int y = 2; y <= cols; y++ )
         {
            out = "-";
            System.out.print(out);
            for( int j = 0; j <= 6 - out.length(); j++ )
            {
              System.out.print(" "); 
            }
         }
         System.out.println(" ");
      }
   }
}
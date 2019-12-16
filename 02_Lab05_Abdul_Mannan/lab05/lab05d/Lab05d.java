import java.util.Scanner;

/**
 * __Lab 05 Part D__
 * @author __Abdul Mannan__
 * @v 1.0 __07/11/2018__
 */

public class Lab05d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // declare all variables required
      double pi1 = 0, pi2 = 0, accu = 0;
      int terms, count = 1;
      
      // take inputs and then output using the given formula
      System.out.println("How many terms of the series do you want to compute?");
      terms = scan.nextInt();
      
      // the working of the function
      for ( int x = 1; x <= terms; x++ )
      {
         if( x % 2 == 1 )
         {
            pi1 = pi1 + ( 4 / (double)count );
         }
         else
         {
            pi1 = pi1 - ( 4 / (double)count );
         }
         count = count + 2;
      }
      System.out.println("Value given by the series function is: " + pi1);
      
      // output using the Math.PI function
      pi2 = Math.PI;
      System.out.println("Value given by the Math.PI java function is: " + pi2);
      
      // resetting values to reduce number of variables need
      count = 1;
      pi1 = 0;
      
      // output with the user specified accuracy after promptimg the user for a value
      System.out.println(" ");
      System.out.println("Within how many decimal points of the real value of pi should it be? e.g. 0.01, 0.1, 0.001?");
      accu = scan.nextDouble();
      accu = (1 / accu);
      for ( int j = 1; j <= accu; j++ )
      {
         if( j % 2 == 1 )
         {
            pi1 = pi1 + ( 4 / (double)count );
         }
         else
         {
            pi1 = pi1 - ( 4 / (double)count );
         }
         count = count + 2;
      }
      System.out.println("Value given by the series function to the specifies acuuracy is: " + pi1);
      
      
   }
}
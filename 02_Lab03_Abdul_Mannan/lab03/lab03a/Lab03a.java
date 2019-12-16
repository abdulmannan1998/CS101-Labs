import java.util.Scanner;

/**
 * __Lab 3a__
 * @author __Mannan Abdul__
 * @version __23/10/2018__
 */

public class Lab03a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //Declcare variables for computations
      int oddValues = 0, evenValues = 0, sumOfValues = 0, n;
       
      //Input Prompt for value of n
      System.out.print("Please enter a value for n: ");
      n = scan.nextInt();
      
      //Loop statement
      for ( int x = 0; x <= 50; x++ ) 
      {
         //If statement to find what x is divisible by and output the appropriate response
         if ( x % 5 == 0 )
         {
            System.out.print( "Hi Five, " );
         }
         else if ( x % 2 == 0 )
         {
            System.out.print( "Hi Two, " );
         }
         else if ( x % 3 == 0 || x % 7 == 0 )
         {
            System.out.print( "Hi ThreeOrSeven, " );
         }
         else
         {
            System.out.print( "Hi Others, " );
         }
         
         //If statement to output all values of x and msg if they are out of range
         if ( x >= 12 && x <= 25 )
         {
            System.out.println( x );
         }
         else
         {
            System.out.println( x + " out of range of 12-15");
         }
         
         //If statement to count the number of even and odd number in range
         if ( x % 2 == 0)
         {
            evenValues = evenValues + 1;
         }
         else
         {
            oddValues = oddValues + 1;
         }
         
         //If statement to find sum of values between 1 and n
         if ( x >= 1 && x <= n)
         {
            sumOfValues = sumOfValues + x;
         }
         
      }
      System.out.println( "The no. of odd values x took is " + oddValues + " and the no. of even values x took is " + evenValues);
      System.out.println( "The sum of all values of x between 1 and " + n + " is " + sumOfValues);
      
      //Comparison of the result through the for loop and the formula given
      if ( sumOfValues == ( n * ( n + 1 ) / 2 ) )
      {
         System.out.println("Value calculated through the formula and through the loop are the same");
      }
      else
      {
         System.out.println("Value calculated through the formula and through the loop are not the same");
      }
   }
}
 
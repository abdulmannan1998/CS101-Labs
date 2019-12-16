import java.util.Scanner;
   
/**
 * __lab 04 Part a__
 * @author __Abdul Mannan__
 * @v.1 __31/10/2018__
 */

public class Lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner ( System.in);
      
      // declaring variables, c for loop count
      int n,c1 = 0, c2 = 1;
      double k,b;
      
      // prompt for value of n
      System.out.println( "Enter the positive integer value of n" );
      n = scan.nextInt();
      
      // while loop 1
      while ( c1 < n )
      {
         System.out.print(c1 + " ");
         c1++;
      }
      
      // reset the value of c1 and output to put space b/w the two loops
      c1 = 0;
      System.out.println("\n");
         
      // while loop 2
      while ( c1 < n )
      {
         if ( c2 % 5 != 0 )
         {
            System.out.print(c1 + " ");
         }
         else
         {
            System.out.print(c1 + "\n");
         }
         c1++;
         c2++;
      }
      
      // set c1 to n and leave space for next loop
      c1 = n;
      if ( ( c2 - 1 ) % 5 != 0 )
      {
         System.out.println("\n");
      }
      else
      {
         System.out.print("\n");
      }
      
      
      // while loop 3
      while ( c1 >= 0 )
      {
         System.out.print(c1 + " ");
         c1--;
      }
      
      // set c1 to n and leave space for next loop
      c1 = -n;
      System.out.println("\n");
      
      // while loop 4
      while ( c1 <= n )
      {
         if ( c1 % 2 == 0 )
         {
            System.out.print(c1 + " ");
         }
         c1++;
      }
      
      // set c1 to 0 and leave space for next loop
      c1 = 0;
      c2 = 0;
      System.out.println("\n");
      
      // while loop 5
      while ( c1 <= n )
      {
         if ( c1 % 2 == 0 )
         {
            if ( c2 % 5 == 0  && c2 != 0 )
            {
               System.out.print( "\n" );
            }
            System.out.print( (int)Math.pow(c1,2) + " " );
            c2++;
         }
         c1++;
      }
      
      // set c1 to n and add space
      c1 = n;
      System.out.println("\n");
      c2 = 0;
      
      // while loop 6
      while ( c1 >= 3 )
      {
         if ( c1 % 3 == 0 ^ c1 % 4 == 0 )
         {
            if ( c2 % 5 == 0 && c2 != 0)
            {
               System.out.println( " " );
            }
            System.out.print( c1 + " ");
            c2++;
         }
         c1--;
      }
         
      // set c1 to n and add space
      c1 = n;
      if ( ( c2 - 1 ) % 5 != 0 )
      {
         System.out.println("\n");
      }
      else
      {
         System.out.print("\n");
      }
      c2 = 1;
      
      
      // while loop 7
      while ( c2 <= n )
      {
         if( c1 % c2 == 0 )
         {
            System.out.print( c2 + " ");
         }
         c2++;
      }
      
      //set c1 to n
      b = n;
      System.out.println("\n");
      
      while ( b >= 1)
      {
         k = 1 / b;
         System.out.format( "%.2f ", k );
         b--;
      }
   }
}
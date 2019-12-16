import java.util.Scanner;

/**
 * __Lab 05 Part A__
 * @author __Abdul Mannan__
 * @v 1.0 __06/11/2018__
 */

public class Lab05a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // declare all variables (wThick is wall thickness)
      int width, height, wThick;
      String repeat, ans="y";
      do
      {
         // prompts and inputs
         System.out.println( "Enter the width of the rectangle");
         width = scan.nextInt();
         System.out.println( "Enter the height of the rectangle");
         height = scan.nextInt();
         System.out.println( "Enter the wall thickness of the rectangle");
         wThick = scan.nextInt();
         
         // validation
         if ( width < 0 || height < 0 || wThick < 0 )
         {
            System.out.print("Error: all values must be positive!");
         }
         else
         {
            // loops for outputs
            for ( int x = 1; x <= height; x++ )
            {
               for( int y = 1; y <= width; y++ )
               {
                  if ( x > wThick && y > wThick && y <= ( width - wThick ) && x <= ( height - wThick ))
                  {
                     System.out.print(" ");
                  }
                  else
                  {
                     System.out.print("*");
                  }
               }
               System.out.println(" ");
            }
         }
         
         // hole check
         if ( width <= 2 * wThick )
         {
            System.out.println("Oops....no hole!");
         }
         
         // ask if the user wants a repeat
         System.out.println("Would you like to create another pattern? (Y/N)");
         repeat = scan.next();
      }while ( repeat.equals(ans) || repeat.equals(ans.toUpperCase()));
   System.out.print("Goodbye");
   }
}
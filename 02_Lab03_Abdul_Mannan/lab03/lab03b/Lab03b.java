import java.util.Scanner;

/**
 * __Lab 03 2nd Part__
 * @author __Abdul Mannan__
 * @v1 __24/10/2018__
 */

public class Lab03b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      /*declare variables for length by shortening to len, declare for area,
      num of flowers and total flowers. declare for semi perimeter too*/
      double len1, len2, len3, area, semiPeri, totalFlowers;
      final int MAXFLOWERS = 17;

      //get inputs from user here
      System.out.println( "Enter the length of the first side side of the triangle");
      len1 = scan.nextInt();
      System.out.println( "Enter the length of the second side of the triangle");
      len3 = scan.nextInt();
      System.out.println( "Enter the length of the third side of the triangle");
      len2 = scan.nextInt();

      //calculate the num of flowers that can fit the specified area
      semiPeri = ( len1 + len2 + len3)/ 2;
      area = Math.sqrt( semiPeri*( semiPeri - len3)*( semiPeri - len2)*( semiPeri - len3));
      totalFlowers = area * MAXFLOWERS;
      
      //output the result or give error
      if ( (len1 < len2 + len3) && (len2 < len1 + len3) && (len3 < len2 + len1) )
      {
         System.out.println( "The total number of flowers that can fit in this triangle is " + (int)totalFlowers);
      }
      else
      {
         System.out.println( "The values of the lengths you gave does not make a triangle!!!" );
      }
      
   }
}
import java.util.Scanner;

/**
 * This is lab06, in this we are going to write a program that will help us
 * understand how we can use methods to help our programming.
 * @author __Abdul Mannan__
 * @version 1.0 __14/11/2018__
 */

public class Lab06
{
   /**
    * the method below will calculate the value of x to the power y
    * @param x is a double input parameter
    * @param y is an integer input parameter
    * @return power is a double output parameter
    */ 
   public static double power( double x, int y)
   {
      double power = x;
      if( y == 0 )
      {
         power = 1;
      }
      else
      {
         for( int j = 1; j < y; j++)
         {
            power = power * x;
         }
      }
      return power;
   }
   
   /**
    * this method will compute n factorial
    * @param n is an integer input parameter
    * @return fValue is a double output parameter
    */
   public static double factorial( int n)
   {
      double fValue = n;
      for( int x = n; x > 1; x--)
      {
         fValue = fValue * ( x- 1 );
      }
      return fValue;
   }
   
   /**
    * this method will be used to reverse a string
    * @param s is a string input parameter
    * @return intermediate is a string output parameter
    */
   public static String reverse( String s)
   {
      String intermediate = "";
      for( int x = s.length(); x >= 1 ; x--)
      {
         intermediate = intermediate + s.charAt(x - 1);
      }
      return intermediate;
   }
   
   /**
    * this method will be used to convert base2 strings to base10 decimals
    * @param base2 is a string input parameter
    * @return decimal is an integer output parameter
    */
   public static int toDecimal( String base2)
   {
      int decimal = 0, count = 0, multiple = 1;
      
      for( int x = base2.length(); x >= 1; x--)
      {
         if( String.valueOf(base2.charAt(x-1)).equals("1"))
         {
            multiple = 1;
            for( int j = 1; j <= count; j++)
            {
                multiple = multiple * 2;
            }
            decimal = decimal + multiple;
         }
         count++;
      }
      return decimal;
   }
   
   /**
    * this method will be used to convert base10 integer to base2 String
    * @param decimal is an integer input parameter
    * @return temp is a string output parameter
    */
   public static String toBinary( int decimal)
   {
      String temp = "";
      while( decimal > 0)
      {
         temp = temp + Integer.toString(decimal % 2);
         decimal = decimal / 2;
      }
      temp = reverse(temp);
      return temp;
   }
   
   /** we'll make a method to calculate the value of Sin for a gýven value here
     * @param value is a double input parameter
     * @return sum is a double ouput parameter
     */ 
   public static double sin( double value)
   {
      int count = 1;
      double sum = 0;
      for( int x = 1; x <= 10; x++)
      {
         if( x % 2 == 1)
         {
            sum = sum + (power(value, count))/ (factorial(count));
         }
         else
         {
            sum = sum - (power(value, count))/ (factorial(count));
         }
         count = count + 2;
      }
      return sum;
   }
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      /* here we are outputting the table of -1 to 10 with their powers to 4
       using our designed method*/
      System.out.println("The followýng ýs the output for part 1");
      for( int x = -1; x <= 10; x++)
      {
         for( int y = 1; y <= 4; y++)
         {
            for( int j = 0; j <= 8 - Double.toString(power(x, y)).length(); j++)
            {
               System.out.print(" ");
            }
            System.out.print(power(x, y));
         }
         System.out.println("");
      }
      System.out.println("");
      // we will output the value of n and n factorial from 1 to 15
      System.out.println("The followýng ýs the output for part 2");
      for( int x = 1; x <= 15; x++)
      {
         for( int j = 0; j <= 2 - Integer.toString(x).length(); j++)
         {
            System.out.print(" ");
         }
         System.out.print(x + " ");
         for( int j = 0; j <= Double.toString(factorial(15)).length() - Double.toString(factorial(x)).length(); j++)
         {
            System.out.print(" ");
         }
         System.out.println(factorial(x));
      }
      System.out.println("");
      
      // we will add 2 binary numbers
      System.out.println("The followýng ýs the output for part 3");
      String num1, num2;
      int sum;
      
      System.out.println("Enter the first binary number");
      num1 = scan.next();
      System.out.println("Enter the second binary number");
      num2 = scan.next();
      System.out.println("");
      sum = toDecimal(num1) + toDecimal(num2);
      System.out.println("The sum of the two binary numbers is: " + toBinary(sum) + "\n");
      
      // we will now reverse a string that the user inputs
      System.out.println("The followýng ýs the output for part 4");
      String phrase, subPhrase1, subPhrase2;
      System.out.println("Enter a phrase that you want to reverse");
      phrase = scan.nextLine();
      phrase = scan.nextLine();
      System.out.println("");
      if(phrase.contains(" "))
      {
         subPhrase2 = phrase;
         phrase = "";
         while( subPhrase2.contains(" "))
         {
            subPhrase1 = subPhrase2.substring(0, subPhrase2.indexOf(" "));
            subPhrase2 = subPhrase2.substring((subPhrase2.indexOf(" ") + 1), subPhrase2.length());
            subPhrase1 = reverse(subPhrase1);
            phrase = phrase + subPhrase1 + " ";
         }
         subPhrase2 = reverse(subPhrase2);
         phrase = phrase + subPhrase2;
         System.out.println("The reversed phrase is: " + phrase);
      }
      else
      {
         System.out.println("The reversed phrase is: " + reverse(phrase));
      }
      System.out.println("");
      /*
       a table will be printed giving us the diff values in an expansion
       values include n, (-1)^n, x^(2n+1), the term computed and the sum
       of the computed terms
       */
      
      double temp = 0, sum2 = 0, value;
      
      System.out.println("Enter the value of sin you want to compute.");
      value = scan.nextDouble();
      System.out.println("The followýng ýs the output for part 5");
      for( int x = 0; x <= 10; x++)
      {
         System.out.print(x + " ");
         System.out.print(power(-1, x) + " ");
         System.out.print(factorial(((2 * x) + 1)) + " ");
         System.out.print(power(value, (2 * x + 1)) + " ");
         temp = ((power(-1, x))/((double)factorial(2 * x + 1))* power(value, 2 * x + 1));
         System.out.print(temp + " ");
         sum2 = sum2 + temp;
         System.out.print(sum2 + " ");
         System.out.println("");
      }
      System.out.println("");
      System.out.println("The value of sýn calculated through the table is: " + sum2);
      System.out.println("");
      System.out.println("The followýng ýs the output for part 6");
      System.out.println("The value of sin calculated from the method is: " + sin(value));
      System.out.println("");
      System.out.println("Value of sin through Math.sin is: " + Math.sin(value));
   }
}
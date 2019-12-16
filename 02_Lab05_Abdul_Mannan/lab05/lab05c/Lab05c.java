import java.util.Scanner;

/**
 * __Lab 05 Part C__
 * @author __Abdul Mannan__
 * @V 1.0 __06/11/2018__
 */

public class Lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // declare all variables required
      double output = 0.0;
      String input = " ", operator = " ";
      Boolean loop = true;
      
      System.out.println("Welcome to \"SimpleCalc\"...");
      
      do
      {
         System.out.println(" ");
         System.out.println("------------------");
         System.out.println("[ " + output + " ]");
         System.out.println("------------------");
         System.out.println("+,-,*,/ value");
         System.out.println("Clear");
         System.out.println("Quit");
         System.out.println("------------------");
         System.out.print("Select: ");
         operator = scan.next();
         input = scan.nextLine();
         input = input.replace(" ","");
         if( operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("Clear") || operator.equals("Quit") || operator.equals("q") || operator.equals("c") || operator.equals("C") || operator.equals("Q")|| operator.equals("quit") || operator.equals("clear"))
         {
            if( operator.equals("+") )
            {
               output = output + Integer.parseInt(input);
            }
            else if( operator.equals("-") )
            {
               output = output - Integer.parseInt(input);
            }
            else if( operator.equals("*") )
            {
               output = output * Integer.parseInt(input);
            }
            else if( operator.equals("/") )
            {
               output = output / Integer.parseInt(input);
            }
            else if( operator.equals("Clear") || operator.equals("clear") || operator.equals("c") || operator.equals("C"))
            {
               output = 0.0;
            }
            else if( operator.equals("Quit") || operator.equals("quit") || operator.equals("q") || operator.equals("Q") )
            {
               loop = false;
            }
         }
         else
         {
            System.out.println(" Unknown Operator ");
            loop = false;
         }
      }while( loop == true );
      System.out.println("Goodbye");
   }
}
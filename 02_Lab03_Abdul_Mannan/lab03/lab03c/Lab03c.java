import java.util.Scanner;
import java.nio.file.*;
import java.io.*;

/**
 * __lab03 Part C__
 * @author __Abdul Mannan__
 * @v 1.0 __24/10/2018__
 */

public class Lab03c
{
   public static void main( String[] args) throws
   FileNotFoundException
   {
      Scanner scan = new Scanner( System.in);
      PrintStream originalStdOut = System.out;
      
      //Declare variables
      String name, comments, tax;
      int age;
      double salary;
      
      /*declare all html tags as constants and use 1 to denote starting tag and 2 to
      denote ending tag*/
      final String DOCTYPE = "<!DOCTYPE html>";
      final String HTML1 = "<html>";
      final String HTML2 = "</html>";
      final String HEAD1 = "<head>";
      final String HEAD2 = "</head>";
      final String TITLE1 = "<title>";
      final String TITLE2 = "</title>";
      final String BODY1 = "<body>";
      final String BODY2 = "</body>";
      final String SPACE = "";
      final String HR1 = "<hr>";
      final String HR2 = "</hr>";
      final String H1_1 = "<h1>";
      final String H1_2 = "</h1>";
      final String P1 = "<p>";
      final String P2 = "</p>";
      
      //take all the appropraite inputs from the user
      System.out.println( "Enter the name of the employee");
      name = scan.nextLine();
      System.out.println( "Enter the age of the employee");
      age = scan.nextInt();
      System.out.println( "Enter the gross salary of the employee");
      salary = scan.nextDouble();
      System.out.println( "Enter any comments you have about the employee");
      comments = scan.nextLine();
      comments = scan.nextLine();
      
      //Here we validate the age of the employee and their salary
      if ( age < 0 )
      {
         System.out.println( "The age is not a valid number!!!");
      }
      else
      {
         if ( salary < 0  || salary >= 10000 )
         {
            System.out.println("The salary you pay this employee is ridiculous, it needs change!!!");
         }
         else
         {
            //In this portion, we calculate the net salary of the employee.
            tax = "";
            if ( salary < 1000 )
            {
               salary = (( salary - 100 ) - 0.05 * ( salary - 100 ));
               tax = "05%";   
            }
            else if ( salary > 5000 )
            {
               salary = (( salary - 100 ) - 0.25 * ( salary - 100 ));
               tax = "25%";   
            }
            else
            {
               salary = (( salary - 100 ) - 0.15 * ( salary - 100 ));
               tax = "15%";   
            }
            
            //output all the data to form a html code that can be run
            System.setOut( new PrintStream( "D:\\CS Work\\03_Lab03_Abdul_Mannan\\lab03\\lab03c\\classes\\magic.htm" ));
            System.out.println( SPACE);
            System.out.println( DOCTYPE);
            System.out.println( SPACE);
            System.out.println( HTML1);
            System.out.println( SPACE);
            System.out.println( HEAD1);
            System.out.println( TITLE1 + name + "'s Home Page" + TITLE2);
            System.out.println( HEAD2);
            System.out.println( SPACE);
            System.out.println( BODY1);
            System.out.println( SPACE);
            System.out.println( HR1);
            if ( Files.exists( Paths.get("D:\\CS Work\\03_Lab03_Abdul_Mannan\\lab03\\lab03c\\classes\\" + name + ".jpg")) == true )
            {
            System.out.println( "<img src=\"" + name + ".jpg\">");
            }
            System.out.println( H1_1 + name + H1_2);
            System.out.println( P1 + "Age: " + age + P2);
            System.out.println(  P1 + "Net Salary: " + salary + " (Tax Rate: " + tax + ")" + P2);
            System.out.println( P1 + "Comments: " + comments + P2);
            System.out.println( HR2);
            System.out.println( SPACE);
            System.out.println( BODY2);
            System.out.println( SPACE);
            System.out.println( HTML2);
            System.out.close();
            System.setOut( originalStdOut);
            System.out.println( "Webpage created.");
         }
      }
   }
}
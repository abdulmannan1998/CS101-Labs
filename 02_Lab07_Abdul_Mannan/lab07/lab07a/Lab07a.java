import java.util.Scanner;

/**
 * __Lab 07 Part A (In this program, we learn to implement OOP)__
 * @author __Abdul Mannan__
 * @version 1.0 __05/12/2018__
 */

public class Lab07a {
   public static void main( String[] args) {
      Scanner scan = new Scanner( System.in);
      
      int rolls,
         pairs,
         die1,
         die2;
      
      System.out.println("How many pairs of dice are there?");
      pairs = scan.nextInt();
      
      rolls = 0;
      for (int x = 1; x <= pairs; x++) {
         do {
            die1 = (int)((Math.random() * 6) + 1);
            die2 = (int)((Math.random() * 6) + 1);
            rolls++;
         }while(die1 != 6 && die2 != 6);
         System.out.println("It took " + rolls + " roll(s) to get 2 sixes on pair " + x);
         rolls = 0;
      }
   }
}


















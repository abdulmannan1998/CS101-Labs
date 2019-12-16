/**
 * __Lab 07 Part A (In this program, we learn to implement OOP)__
 * @author __Abdul Mannan__
 * @version 1.0 __05/12/2018__
 */

public class TestDie {
   public static void main( String[] args) {
      Die die1;
      
      die1 = new Die();
      
      die1.roll();
      System.out.println( die1.getFaceValue());
      System.out.println( die1);
   }
}
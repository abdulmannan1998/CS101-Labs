/**
 * __Lab 07 Part A (In this program, we learn to implement OOP)__
 * @author __Abdul Mannan__
 * @version 1.0 __05/12/2018__
 */

public class TestDice {
   public static void main( String[] args) {
      Dice die1;
      
      die1 = new Dice();
      
      die1.roll();
      System.out.println( die1.getDie1FaceValue());
      System.out.println( die1.getDie2FaceValue());
      System.out.println( die1.getDiceTotal());
   }
}
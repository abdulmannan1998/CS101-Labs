/**
 * __Lab 07 Part A (In this program, we learn to implement OOP)__
 * @author __Abdul Mannan__
 * @version 1.0 __05/12/2018__
 */

public class TestDiceGame{
   public static void main( String[] args) {
      DiceGame game = new DiceGame();
      Dice test = new Dice();
      System.out.println( game.play());
   }
}
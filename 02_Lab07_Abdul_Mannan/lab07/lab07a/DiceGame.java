/**
 * __Lab 07 Part A (In this program, we learn to implement OOP)__
 * @author __Abdul Mannan__
 * @version 1.0 __05/12/2018__
 */

public class DiceGame {
    private Dice dice;
   
   public DiceGame() {
      dice = new Dice();
   }
   /**
    * this method will return the number of times the dice had to be rolled
    * to get two sixes
    * @return
    */
   public int play() {
      int roll,
          count;
      count = 0;
      roll = 0;
      do {
      count++;
      roll = dice.roll();
      }while(roll != 12);
      return count;
   }
}
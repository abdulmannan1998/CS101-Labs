/**
 * __Lab 09 (In this program, we learn to implement OOP and arrays by building
 * on our previous program.)__
 * @author __Abdul Mannan__
 * @version 1.0 __20/12/2018__
 */

public class Dice {
   //properties
   private Die die1;
   private Die die2;
   private int diceResult;
   
   //constructors
   public Dice() {
      die1 = new Die();
      die2 = new Die();
   }
   
   //methods
   /**
    * this method will roll two dice together and return their result
    * @return an integer result
    */
   public int roll() {
      diceResult = (die1.roll() + die2.roll()); 
      return diceResult;
   }
   
   /**
    * method will get face value of die 1
    * @return string face Value of die 1
    */
   public int getDie1FaceValue() {
      return die1.getFaceValue();
   }
   
   /**
    * method will get face value of die 2
    * @return  string face Value of die 2
    */
   public int getDie2FaceValue() {
      return die2.getFaceValue();
   }
   
   /**
    * method will return dice total
    * @return  is an integer diceTotal
    */
   public int getDiceTotal() {
      return diceResult;
   }
   
   public String toString() {
      return Integer.toString(diceResult);
   }
}







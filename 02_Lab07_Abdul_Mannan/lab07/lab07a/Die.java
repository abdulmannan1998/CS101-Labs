/**
 * __Lab 07 Part A (In this program, we learn to implement OOP)__
 * @author __Abdul Mannan__
 * @version 1.0 __05/12/2018__
 */

public class Die {
   //properties
    private int faceValue;
   
   //constructors
   public Die() {
      faceValue = 0;
   }
   //methods
   /**
    * this method generates a random value for a die
    * @return is an integer dieValue that returns the value of the die
    */
   public int roll() {
      faceValue = (int)((Math.random() * 6) + 1);
      return faceValue;
   }
   
   /**
    * this method returns the face value of the die
    * @return is an integer faceValue
    */
   public int getFaceValue() {
      return faceValue;
   }
 
   public String toString() {
      return Integer.toString(faceValue);
   }
                          
}
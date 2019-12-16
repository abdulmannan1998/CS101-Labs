/**
 * __We are writing a class BigNum which is supposed to store numbers of a
 * particular size and base__
 * @author __Abdul Mannan__
 * @version 1.0 __12/27/2018__
 */

public class BigNum {
   //properties
   final int SIZE = 4;
   final int BASE = 10;
   int[] number = new int[SIZE];
   
   //constructors
   //to create a number that represents zero
   public BigNum() {
      for( int x = 0; x < SIZE; x++) {
         number[x] = 0;
      }
   }
   
   //to use a strýng value to create a BigNum
   public BigNum( String value) {
      for( int x = 0; x < SIZE; x++) {
         number[x] = 0;
      }
       
      for( int x = 0; x < value.length(); x++) {
         number[x] = Integer.valueOf(String.valueOf(value.charAt(value.length() - 1 - x)));
      }
   }
   
   //to copy the value of a BigNum into another
   public BigNum( BigNum copy) {
      for( int x = 0; x < SIZE; x++) {
         number[x] = copy.number[x];
      }
   }
   
   //methods
   /**
    * method to output class objects
    * @return value which is a String
    */
   public String toString() {
      String value;
      value = "";
      for( int x = SIZE - 1; x >= 0; x--) {
         value =  value + Integer.toString(number[x]);
      }
      return value;
   }
   
   /**
    * method to check if 2 BýgNum objects are equal
    * @param other which is a BigNum
    * @return equal which is a boolean
    */
   public boolean equals( BigNum other) {
      boolean equal;
      equal = true;
      for( int x = 0; x < SIZE; x++) {
         if( number[x] != other.number[x]) {
            equal = false;
         }
      }
      return equal;
   }
   
   /**
    * method to check if the object is equal to zero
    * @return equal which is a boolean
    */
   public boolean isZero() {
      boolean equal;
      equal = true;
      for( int x : number) {
         if( x != 0) {
            equal = false;
         }
      }
      return equal;
   }
   
   /**
    * method to shift numbers left or right
    * @param left which is a boolean
    */
   public void shift( boolean left) {
      if( left == true){
         for( int x = SIZE - 1; x >= 1; x--) {
            number[x] = number[x - 1];
         }
         number[0] = 0;
      }
      else {
         for( int x = 0; x < SIZE - 1; x++) {
            number[x] = number[x + 1];
         }
         number[SIZE - 1] = 0;
      }
   }
   
   /**
    * method to add 2 BigNum objects
    * @param other which is a BigNum
    * @return overflow which is an int that tells us if there is any carry
    */
   public int add( BigNum other) {
      int overflow = 0;
      int value;
      for( int x = 0; x < SIZE; x++) {
         value = number[x] + other.number[x] + overflow;
         overflow = 0;
         if( value >= BASE) {
            value = value - BASE;
            overflow = 1;
         }
         number[x] = value;
      }
      return overflow;
   }
   
   /**
    * method to check if a BigNum object is less than the other
    * @param other which is a BigNum object
    * @return boolean value
    */
   public boolean isLessThan( BigNum other) {
      boolean result;
      result = false;
      for( int x = SIZE - 1; x >= 0; x--) {
         if( number[x] < other.number[x]) {
            result = true;
            return result;
         }
         else if(number[x] > other.number[x]) {
            return result;
         }
      }
      return result;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
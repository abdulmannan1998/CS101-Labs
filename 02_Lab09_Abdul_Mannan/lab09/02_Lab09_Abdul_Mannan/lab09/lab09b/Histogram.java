import java.util.ArrayList;
/**
 * __Lab 09 (In this program, we learn to implement OOP and arrays by building
 * on our previous program.)__
 * @author __Abdul Mannan__
 * @version 1.0 __20/12/2018__
 */

public class Histogram {
   public static void main( String[] args) {
      histogram( frequencyData());
      
   }
   
   
   /**
    * this method is helping us gather the frequency of data needed for the
    * histogram
    * @return an ArrayList with the data
    */
   public static ArrayList<String> frequencyData() {
      final int ROLLS = 10;
      ArrayList<String> frequency = new ArrayList<String>();
      Dice die = new Dice();
      for( int x = 0; x < ROLLS; x++) {
         die.roll();
         frequency.add(die.toString());
      }
      return frequency;
   }
   
   /**
    * this method is helping us use the frequency of data to make a histogram
    * @param data which is an ArrayList
    */
   public static void histogram( ArrayList<String> data) {
      int count1, maxFreq;
      double scale;
      ArrayList<Integer> count = new ArrayList<Integer>();
      
      for( int y = 2; y <= 12; y++) {
      count1 = 0;
         for( int x = 0; x < data.size(); x++) {
            if( data.get(x).equals(Integer.toString(y))) {
               count1++;
            }
         }
         count.add(count1);
      }
      
      maxFreq = 0;
      for( int x = 0; x < count.size(); x++) {
         if( count.get(x) > maxFreq) {
            maxFreq = count.get(x);
         }
      }
      
      scale = Math.ceil((double)maxFreq / 10);
      for( int y = 10; y > 0; y-- ) {
         for( int x = 0; x < count.size(); x++) {
            if( count.get(x) >= (scale * y)) {
               System.out.print("*");
            }
            else {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
      System.out.println("The maximum frequency is " + maxFreq);
      System.out.println("One star represents a frequency of " + scale);
//      For Proof       
//      System.out.println(count);
//      System.out.println(scale);
   }
}
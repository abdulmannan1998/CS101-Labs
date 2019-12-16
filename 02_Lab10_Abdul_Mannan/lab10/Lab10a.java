/**
 * __We are writing a program to test the class BigNum which is supposed to 
 * store numbers of a particular size and base__
 * @author __Abdul Mannan__
 * @version 1.0 __12/27/2018__
 */

public class Lab10a {
   public static void main( String[] args) {
      BigNum b1;
      BigNum b2;
      BigNum b3;
      
      b1 = new BigNum();
      b2 = new BigNum("1500");
      b3 = new BigNum("1500");
      System.out.println(b2.equals(b3));
      //b2.add(b3);
      
      
      
      System.out.println(b1);
      System.out.println(b2);
//      b2.shift( false);
//      System.out.println(b2);
//      b2.shift( true);
      System.out.println(b2);
      System.out.println(b3);
      System.out.println(b1.isZero());
      //System.out.println( b2.add(b3));
      System.out.println(b2);
      System.out.println(b3);
      System.out.println(b2.isLessThan(b3));
      
   
   
   
   }
}
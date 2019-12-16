import java.util.Scanner;

/**
 * __We are writing a program that implements the class BigNum which is 
 * supposed to store numbers of a particular size and base__
 * @author __Abdul Mannan__
 * @version 1.0 __12/27/2018__
 */

public class Lab10b {
   public static void main( String[] args) {
      Scanner scan = new Scanner( System.in);
      
      //variables and array declaration
      BigNum[] numberList = new BigNum[10];
      String number;
      int n;
      int location;
      BigNum temp;
      location = 0;
      
      numberList[0] = new BigNum();
      for( int y = 0; y < numberList.length; y++) {
         number = "";         
         for( int x = 0; x < numberList[0].SIZE; x++) {
            number = number + Integer.toString((int)(Math.random() * numberList[0].BASE));
         }
         numberList[y] = new BigNum( number);
      }
      do {
         System.out.println("");
         System.out.println("Enter the value of n: ");
         n = scan.nextInt();
         if( n >= 0) {
            for( int x = 0; x < n; x++) {
               if(!numberList[x].isLessThan(numberList[location])) {
                  location = x;
               }
            }
            System.out.println("The biggest number is at location " + (location + 1));
            
            for( BigNum x : numberList) {
               System.out.println(x);
            }
            
            System.out.println("");
            System.out.println("After swapping\n");
            
            temp = numberList[n - 1];
            numberList[n - 1] = numberList[location];
            numberList[location] = temp;
            
            for( BigNum x : numberList) {
               System.out.println(x);
            }
         }
      }while(n >= 0);
      
      
      
      
      
      
   }
}
/**
 * __Lab 07 Part B (In this program, we learn to implement OOP)__
 * @author __Abdul Mannan__
 * @version 1.0 __05/12/2018__
 */

public class TestLibraryBook {
   public static void main( String[] args) {
      LibraryBook  book1 = new LibraryBook( "CS", "Abdul Mannan");
      LibraryBook  book2 = new LibraryBook( "Calculus", "Okan Tekman");
   
      book1.loanBook();
      System.out.println(book1.onLoan());
      System.out.println(book1.getTimesLoaned());
      System.out.println(book1.onLoan());
   
      System.out.println(book1);
      System.out.println(book2);
   }
}
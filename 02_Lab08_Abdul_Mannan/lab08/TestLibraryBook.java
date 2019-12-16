/**
 * __Lab 08 (just the test libraybook class from last time.)__
 * @author __Abdul Mannan__
 * @version 1.0 __13/12/2018__
 */


public class TestLibraryBook {
   public static void main( String[] args) {
      LibraryBook book1 = new LibraryBook( "CS", "Abdul Mannan");
      LibraryBook book2 = new LibraryBook( "Calculus", "Okan Tekman");
      LibraryBook book3; 
      
      System.out.println(book1 == book2);
      System.out.println(book1.equals(book2) + "\n");
      
      book2 = book1;
      
      System.out.println(book1 == book2);
      System.out.println(book1.equals(book2) + "\n");
      
      book3 = new LibraryBook( book1);
      
      System.out.println(book1 == book3);
      System.out.println(book1.equals(book3) + "\n");
      
      System.out.println(book1.hasSameTitle(book2));
      System.out.println(book1.hasSameAuthor(book2));
   }
}
/**
 * __Lab 08 (In this program, we learn to implement OOP further by making our
 * own classes and then using them in a program.)__
 * @author __Abdul Mannan__
 * @version 1.0 __13/12/2018__
 */

public class Library {
   // properties
   LibraryBook b1,
      b2,
      b3,
      b4;
   
   // constructors
   public Library() {
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
   }
   
   /**
    * this method checks to see if the library is empty or not
    */
   public boolean isEmpty() {
      return b1 == null &&
         b2 == null &&
         b3 == null &&
         b4 == null;
   }
   
   /**
    * this is the toString method of this class
    * @return a String with the contents of the library
    */
   public String toString() {
      String contents = "";
      if( isEmpty() == true) {
         contents = "The library is empty!!!";
      }
      else {
         if( b1 != null) {
            contents =  contents + b1.toString() + "\n";
         }
         if (b2 != null) {
            contents = contents + b2.toString() + "\n";
         }
         if (b3 != null) {
            contents = contents + b3.toString() + "\n";
         }
         if (b4 != null) {
            contents = contents + b4.toString() + "\n";
         }
      }
      return contents;
   }
   
   /**
    * this method is used to add a new book to the library if there is space
    */
   public void add( String title, String author) {
      if( b1 == null) {
         b1 = new LibraryBook( title, author);
      }
      else if (b2 == null) {
         b2 = new LibraryBook( title, author);
      }
      else if (b3 == null) {
         b3 = new LibraryBook( title, author);
      }
      else if (b4 == null) {
         b4 = new LibraryBook( title, author);
      }
      else {
         System.out.println("Library full! Cannot add any more books!");
      }
   }
   
   /**
    * this method will remove the current book from the library by setting it to null
    * @return a boolean that tells us if the book to remove is present in the library or not
    */
   public boolean remove( LibraryBook bookToRemove) {
      if( bookToRemove.onLoan()) {
         return false;
      }
      else {
         if( b1 != null && bookToRemove.equals(b1)) {
            b1 = null;
         }
         else if( b2 != null && bookToRemove.equals(b2)) {
            b2 = null;
         }
         else if( b3 != null && bookToRemove.equals(b3)) {
            b3 = null;
         }
         else if( b4 != null && bookToRemove.equals(b4)) {
            b4 = null;
         }
         return true;
      }
   }
   
   /**
    * this method will hwlp us a find a library book by its title
    * @return either a LibraryBook if found else null
    */
   public LibraryBook findByTitle( String title) {
      
      if(  b1 != null && b1.getTitle().equals(title)) {
         return b1;
      }
      else if(  b2 != null && b2.getTitle().equals(title)) {
         return b2;
      }
      else if(  b3!= null && b3.getTitle().equals(title)) {
         return b3;
      }
      else if(  b4 != null && b4.getTitle().equals(title)) {
         return b4;
      }
      else {
         return null;
      }
   }
   
}









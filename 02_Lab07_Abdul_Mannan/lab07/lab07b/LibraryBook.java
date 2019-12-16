/**
 * __Lab 07 Part B (In this program, we learn to implement OOP)__
 * @author __Abdul Mannan__
 * @version 1.0 __05/12/2018__
 */

public class LibraryBook {
   //properties
   private String title,
      author,
      dueDate;
   
   int timesLoaned;
   
   //constructors
   public LibraryBook( String title, String author) {
      this.title = title;
      this.author = author;
      this.dueDate = "";
      this.timesLoaned = 0;
   }
   
   //methods
   /**
    * this method will change properties when a book is loaned
    */
   public void loanBook() {
      dueDate = "31/12/2018";
      timesLoaned++;
   }
   
   /**
    * this method will change properties when a book is returned
    */
   public void returnBook() {
      dueDate = "";
   }
   
   /**
    * this method will return how many times a book is loaned
    * @return an integer timesLoaned
    */
   public int getTimesLoaned() {
      return timesLoaned;
   }
   
   /**
    * this method will return how many times a book is loaned
    * @return a boolean loanStatus
    */
   public boolean onLoan() {
      if(dueDate.equals("")) {
         return false;
      }
      else {
         return true;
      }
   }
   
   public String toString() {
      String due;
      if ( onLoan() == true) {
         due = ". The book is on loan and it's due date is " + dueDate;
      }
      else {
         due = ". The book is not on loan";
      }
      return ("The book \"" + title + "\" is written by " + author + due);
   }
}
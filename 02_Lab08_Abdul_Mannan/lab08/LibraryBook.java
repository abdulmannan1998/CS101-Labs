/**
 * __Lab 08 (This is the same class fro Lab07 Part B, we copied it to use it in
 * our program. Only a new get title method has been added to it.__
 * @author __Abdul Mannan__
 * @version 1.0 __13/12/2018__
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
   
   public LibraryBook( LibraryBook copy) {
      this.title = copy.title;
      this.author = copy.author;
      this.dueDate = copy.dueDate;
      this.timesLoaned = copy.timesLoaned;
   }
   
   //methods
   /**
    * this method will compare two objects to each other
    * @return boolean of whether the book has the same title and author as the book it is being
    * compared to.
    */
   public boolean equals( LibraryBook compare) {
      return this.title.equals(compare.title) &&
         this.author.equals(compare.author);
   }
   
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
    * this method will return the title of the book since we are using the title 
    * variable as private.
    * @return a String title
    */
   public String getTitle() {
      return this.title;
   }
   
   /**
    * this method will return how many times a book is loaned
    * @return a boolean loanStatus
    */
   public boolean onLoan() {
      return !dueDate.equals("");
   }
   
   /**
    * this method will check to see if a book has the same title as the one being compared to
    * @return boolean of whether the book has the same title as the book it is being
    * compared to.
    */
   public boolean hasSameTitle( LibraryBook compare) {
      return this.title.equals(compare.title);
   }
   
   /**
    * this method will check to see if a book has the same author as the one being compared to
    * @return boolean of whether the book has the same author as the book it is being
    * compared to.
    */
   public boolean hasSameAuthor( LibraryBook compare) {
      return this.author.equals(compare.author);
   }
   
   /**
    * the toString method for this class
    * @return a String that will give us the book details
    */
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
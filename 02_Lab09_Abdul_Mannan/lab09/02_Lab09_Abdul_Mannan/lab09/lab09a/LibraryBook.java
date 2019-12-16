import java.util.Scanner;
/**
 * __Lab 09 (In this program, we learn to implement OOP and arrays by building
 * on our previous program.)__
 * @author __Abdul Mannan__
 * @version 1.0 __20/12/2018__
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
    * @param compare which is a LibraryBook
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
      Scanner scan = new Scanner( System.in);
      System.out.println("Enter the due date for the book (DD/MM/YYYY)");
      dueDate = scan.nextLine();
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
    * @param compare which is a LibraryBook
    * @return boolean of whether the book has the same title as the book it is being
    * compared to.
    */
   public boolean hasSameTitle( LibraryBook compare) {
      return this.title.equals(compare.title);
   }
   
   /**
    * this method will check to see if a book has the same author as the one being compared to
    * @param compare which is a LibraryBook
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
         due = ". The book is on loan and it's due date is " + dueDate + ". The book has been loaned " + timesLoaned + " time(s).";
      }
      else {
         due = ". The book is not on loan. The book has been loaned " + timesLoaned + " time(s).";
      }
      return ("The book \"" + title + "\" is written by " + author + due);
   }
}
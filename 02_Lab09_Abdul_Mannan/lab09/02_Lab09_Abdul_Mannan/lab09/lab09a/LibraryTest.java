import java.util.Scanner;

/**
 * __Lab 09 (In this program, we learn to implement OOP and arrays by building
 * on our previous program.)__
 * @author __Abdul Mannan__
 * @version 1.0 __20/12/2018__
 */


public class LibraryTest {
   public static void main( String[] args) {
      Scanner scan = new Scanner( System.in);
      
      // all the variable are declared
      Library library = new Library();
      String option,
         find,
         title,
         author,
         action;
      LibraryBook book;
      
      action = "";
      
      // loop so that program only exits if user enters "Exit"
      do {
         System.out.println( "Library \n\n Select one of the options: Show, Find, Add or Exit.");
         //loop to verify input
         do {
            option = scan.next();
            if( !compare(option)) {
               System.out.println("Invalid input, try again!");
            }
         }while( !compare(option));//verification ends here
         
         if(!option.equals("Exit")) {
            //implementation of the menu
            if( option.equals("Show")) {
               System.out.println(library.toString());
            }
            else if( option.equals("Add")) {
               System.out.println("Enter the title of the book you want to add.");
               title = scan.nextLine();
               title = scan.nextLine();
               System.out.println("Enter the author of the book you want to add.");
               author = scan.nextLine();
               library.add( title, author);
            }
            else {
               System.out.println("Enter the title of the book you want to find.");
               find = scan.nextLine();
               find = scan.nextLine();
               if( null == library.findByTitle(find)) {
                  System.out.println("There are no books by this name in the library");
               }
               else {
                  book = library.findByTitle(find);
                  System.out.println("Choose one of the following: Loan, Return, Remove or Exit");
                  do {
                     action = scan.next();
                     if( !compare2(action)) {
                        System.out.println("Invalid input, try again!");
                     }
                  }while( !compare2(action));
                  
                  if( action.equals("Loan")) {
                      book.loanBook();
                  }
                  else if( action.equals("Return")) {
                     book.returnBook();
                  }
                  else if( action.equals("Remove")) {
                     if( !library.remove( book)) {
                        System.out.println("The book is not the library at the moment!");
                     }
                  }
               }
            }
         }
      }while( !option.equals("Exit"));
      System.out.println("Goodbye");
   }
   
   /**
    * this method will check if the 1st input is acceptable or not
    * @param value which is a String
    * @return boolean
    */
   public static boolean compare( String value) {
      return value.equals("Show") ||
         value.equals("Find") ||
         value.equals("Add") ||
         value.equals("Exit");
   }
   
   /**
    * this method will check if the 2nd input is acceptable or not
    * @param value which is a String
    * @return boolean
    */
   public static boolean compare2( String value) {
      return value.equals("Loan") ||
         value.equals("Return") ||
         value.equals("Remove") ||
         value.equals("Exit");
   }
   
   
   
   
   
}
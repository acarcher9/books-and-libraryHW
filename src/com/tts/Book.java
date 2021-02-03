package com.tts;

public class Book {
    String title;
    boolean borrowed;

//    Creates a new Book
    public Book(String bookTitle){
        //method needed here!
     this.title = bookTitle;
     this.borrowed = false;
    }

//    marks book as rented
    public void borrowed() {
        this.borrowed = true;
    }

//    marks book as NOT rented
    public void returned() {
        this.borrowed = false;
    }

//    returns 'true' if the book is rented, false otherwise
    public boolean isBorrowed() {
//       this loop is ~not necessary~
//       if (this.borrowed) {
//           return true;
//        } else {
//            return false;
//        }
        return this.borrowed;
    }

//    returns title of the book
    public String getTitle() {
        return this.title;
    }

    public static void main(String[] args) {

//      test of the Book class
        Book example = new Book("Cowboys Are My Weakness");
        System.out.println("Title: (should be Cowboys Are My Weakness) " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}


//    Step One: Implement Book
// First we need a class to model books. Start by downloading the attached Book.java file This class defines methods to get the title of a book, find out if it is available, borrow the book, and return the book. However, the skeleton that we provide is missing the implementations of the methods. Fill in the body of the methods with the appropriate code. The main method tests the methods. When you run the program, the output should be:
//
//        Title (should be The Da Vinci Code): The Da Vinci Code
//        Rented? (should be false): false
//        Rented? (should be true): true
//        Rented? (should be false): false
//
//        Hint: Look at the main method to see how the methods are used, then fill in the code for each method.



package com.tts;

import java.util.HashMap;


public class Library {

private String address;
private HashMap<String, Book> bookHashMap;

public Library(String address){
    this.address = address;
    this.bookHashMap = new HashMap<String,Book>();
}

public void addBook(Book book) {
    this.bookHashMap.put(book.getTitle(), book);
}

public static void printOpeningHours(){
    System.out.println("Libraries are open daily from 9am-5pm.");
}

public void printAddress(){
    System.out.println(this.address);
}

public void borrowBook(String title){
   if (bookHashMap.containsKey(title)) {
       if (bookHashMap.get(title).isBorrowed()) {
       System.out.println("Sorry, this book is already borrowed.");
   } else {
           Book book = bookHashMap.get(title);
           book.borrowed();
       }
   } else {
    System.out.println("Sorry this book is not in our catalog.");
    }
}

public void printAvailableBooks(){
    for (String bookTitle : bookHashMap.keySet()) {
        if (!bookHashMap.get(bookTitle).isBorrowed()) {
            System.out.println(bookTitle);
        }
    }
}

// Add the missing implementation to this class

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}

//


//    Step Two: Implement Library
//        Next we need to build the class that will represent each library, and manage a collection of books. All libraries have the same hours: 9 AM to 5 PM daily. However, they have different addresses and book collections (i.e., arrays of Book objects).
//
//        Download the attached Library.java file. We provide a main method that creates two libraries, then performs some operations on the books. However, all the methods and member variables are missing. You will need to define and implement the missing methods. Read the main method and look at the compile errors to figure out what methods are missing.
//
//        Notes
//        Some methods will need to be static methods, and some need to be instance methods.
//        Be careful when comparing Strings objects. Use string1.equals(string2) for comparing the contents of string1 and string2.
//        You should get a small part working at a time. Start by commenting the entire main method, then uncomment it line by line. Run the program, get the first lines working, then uncomment the next line, get that working, etc.
//        You must not modify the main method.
//public class Library {
//
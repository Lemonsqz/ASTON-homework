package main.java.org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Chernovik", "Lukianenko", 2005, true);
        Book book2 = new Book("Master i margarita", "Bulgakov", 1940, true);
        Book book3 = new Book("Chistovik", "Lukianenko", 2005, true);
        Book book4 = new Book("Tainstvenniy ostrov", "Jules Verne");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("\nДоступные книги: ");
        library.printAvailableBooks();

        System.out.println("\nПоиск книг по автору: ");
        library.findBooksByAuthor("Lukianenko");


        System.out.println("\nВывод доступных книг,после изменения статуса одной из них:");
        book4.returnBook();
        library.printAvailableBooks();




    }
}
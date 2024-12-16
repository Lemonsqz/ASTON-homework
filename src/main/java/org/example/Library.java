package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();
    void addBook(Book book){
        books.add(book);
    }
    public void printAvailableBooks(){
        for (Book book:books){
            if (book.isAvailable()){
                System.out.println(book.getTitle());
            }
        }
    }
    public void findBooksByAuthor(String author){
        for (Book book:books){
            if (book.getAuthor().equalsIgnoreCase(author)){
                System.out.println(book.getTitle());
            }
        }
    }

}

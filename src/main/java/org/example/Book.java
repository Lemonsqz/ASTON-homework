package org.example;

public class Book {

    private String title;
    private String author;
    private int year;
    private boolean isAvailable = true;

    private int pages;

    public Book(String title, String author, int year, boolean isAvailable,int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
        this.pages=pages;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        year = 0;
        isAvailable = false;
        pages = 150;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        year = 0;
        isAvailable = true;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public void borrowBook() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void displayInfo() {
        System.out.println("\nНазвание: "+title);
        System.out.println("Автор: "+author);
        System.out.println("Год: "+year);

        System.out.println("В наличии: "+(isAvailable?"да":"нет"));
    }
}

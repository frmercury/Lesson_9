package org.project;

public class Book {

    private String bookName;

    private String bookAuthor;

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public Book(String name, String author) {
        this.bookName = name;
        this.bookAuthor = author;
    }

    public void getInfo () {
        System.out.println("Name of Book: " + bookName);
        System.out.println("Author of Book: " + bookAuthor);
        System.out.println("");
    }
}

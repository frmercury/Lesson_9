package org.project;

public class Reader {

    public Reader(String fio, int ticketNumber, String faculty, String dateOfBirth, String telephone) {
        this.fio = fio;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.telephone = telephone;
    }

    private String fio;
    private int ticketNumber;
    private String faculty;
    private String dateOfBirth;
    private String telephone;


    public void takeBook(int bookAmount) {
        System.out.printf("Студент %s взял %d книг%n", fio, bookAmount);
    }

    public void takeBook(String... booksNames) {
        System.out.printf("Студент %s взял книги: %n", fio);
        for (String book: booksNames) {
            System.out.println(book + " ");
        }
    }

    public void takeBook(Book... books) {
        System.out.printf("Студент %s взял книги: %n", fio);
        for (Book book: books) {
            System.out.printf(book.getBookName()+"; author: " + book.getBookAuthor() + "\n");
        }
    }

    public void returnBook (int bookAmount) {
        System.out.printf("Студент %s вернул %d книг%n", fio, bookAmount);
    }

    public void returnBook (String... booksNames) {
        System.out.printf("Студент %s вернул книги: %n", fio);
        for (String book: booksNames) {
            System.out.println(book + " ");
        }
    }
    public void returnBook (Book... books) {
        System.out.printf("Студент %s вернул книги: %n", fio);
        for (Book book: books) {
            System.out.printf(book.getBookName()+"; author: " + book.getBookAuthor() + "\n");
        }
    }

    public void getInfo () {
        System.out.println("ФИО: "+fio);
        System.out.println("Номер читательского билета: "+ticketNumber);
        System.out.println("Факультет: "+faculty);
        System.out.println("Дата рождения: "+dateOfBirth);
        System.out.println("Номер телефона: "+telephone);
        System.out.println("");
    }
}
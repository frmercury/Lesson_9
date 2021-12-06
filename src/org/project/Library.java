package org.project;

public class Library {

    public static void main(String[] args) {
        Reader reader1 = new Reader("Антонов В.И", 12842, "ФИОТ", "23.01.1995", "380506128");
        Reader reader2 = new Reader("Петров А.К", 12156, "ВАФ", "11.08.1996", "3804612185");
        Reader reader3 = new Reader("Семенов Д.В", 12848, "РКО", "17.07.1993", "3806818145");

        Book book1 = new Book("Lord of the rings", "Tolkien");
        Book book2 = new Book("Harry Potter", "Rowling");
        Book book3 = new Book("Game of Thrones", "J.Martin");
        Book book4 = new Book("Silmarillion", "Tolkien");

        Book [] bookArr = {book1,book2,book3,book4};
        Reader [] readersArr = {reader1,reader2,reader3};

        reader1.takeBook(5);
        reader2.takeBook(book1, book2, book3);
        reader3.takeBook("LOR", "HP", "GOT");

        reader3.returnBook(3);
        reader1.returnBook(book1, book3);

        printBooks(bookArr);
        printReaders(readersArr);

    }

     public static void printBooks (Book... booksArr) {
         System.out.println("Список книг: \n");
        for (Book books: booksArr) {
            books.getInfo();
        }
     }

    public static void printReaders (Reader... readersArr) {
        System.out.println("Список студентов: \n");
        for (Reader readers: readersArr) {
            readers.getInfo();
        }
    }
}

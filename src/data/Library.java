package data;

// Po modyfikatorach dostępu

//TODO: NEXT STEP IN APP

import data.Book;
import utils.DataReader;

public class Library {
    public final int maxBooks = 1000;
    private Book[] books;
    private int booksNumber;

    public Library() {
        books = new Book[maxBooks];
    }

    public int getBooksNumber() {
        return booksNumber;
    }

    public void addBook(Book book) {
        if (booksNumber < maxBooks) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maksymalna liczba książek została osiągnięta");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }
}


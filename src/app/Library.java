package app;

// Po modyfikatorach dostępu

//TODO: NEXT STEP IN APP

import data.Book;
import utils.DataReader;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.6";

        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();

        System.out.println(appName);
        System.out.println("Wprowdź nową książkę: ");
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        books[0].printInfo();
        books[1].printInfo();
        System.out.println("System może przechowywać do " + books.length + " książek");
    }

}

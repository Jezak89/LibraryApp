package app;

import io.DataReader;
import model.Book;
import model.Library;
import model.Magazine;

public class LibraryControl {

    // komunikacja z użytkownikiem
    private DataReader dataReader = new DataReader();

    //biblioteka przechowujaca dane
    private Library library = new Library();
    /*
     * Główna metoda programu, która pozwala na wybór opcji i interakcję
     */

    public void controlLoop() {
        Option option;

        do {
            printOptions();
            option = Option.createFromInt(dataReader.getInt());
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadz ponownie:");
            }
        } while (option != Option.EXIT);
    }


    private void printOptions() {
        System.out.println("Wybierz opcję:");
        for (Option option : Option.values()) {
            System.out.println(option);
        }
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines() {
        library.printMagazines();
    }


    private void exit() {
        System.out.println("Koniec programu.");
        //zamykamy strumień wejścia
        dataReader.close();
    }


}

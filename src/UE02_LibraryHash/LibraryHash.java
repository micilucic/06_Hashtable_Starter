package UE02_LibraryHash;

import java.io.BufferedReader;
import java.io.FileReader;

public class LibraryHash {
    private String[] books;

    // Konstruktor
    public LibraryHash(int size) {
        books = new String[size];
    }

    // Bücher aus einer Textdatei einlesen
    public void addBooksFromFile() {
        String line;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("books.txt"));

            while ((line = br.readLine()) != null) {
                add(line);
            }

            br.close();
        } catch (Exception | HashFullException e) {
            e.printStackTrace();
        }
    }

    // Ein Buch zur Hashtable hinzufügen
    public void add(String bookTitle) throws HashFullException {


        int hasValue = 0;

        for (int i = 0; i < books.length; i++) {
            int h = Math.abs(bookTitle.hashCode() + i) % books.length;

            if (books[hasValue] == null) {
                books[hasValue] = bookTitle;
            }
        }
    }

    // Ein Buch aus der Hashtable entfernen
    public Boolean remove(String bookTitle) {
        // TODO: Implementieren
        return false;
    }

    // Abfrage, ob ein bestimmtes Buch in der Hashtable vorhanden ist
    public Boolean isBookInStock(String bookTitle) {
        // TODO: Implementieren
        return false;
    }

}

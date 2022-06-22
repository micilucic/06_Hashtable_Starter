package UE05_LibraryHashWithList;

import java.util.Iterator;
import java.util.LinkedList;


public class LibraryHashWithList<list> {
    private LinkedList<Book>[] books;


    public LibraryHashWithList(int size) {
        books = new LinkedList[size];
    }

    public boolean addBook(Book newBook) {
        int index = getIndexByHashCalc(newBook.getId());

        if(books[index] == null) {
            books[index] = new LinkedList<>();
        }
        return books[index].add(newBook);
    }

    public Book getBookById(int id) {
        int index = getIndexByHashCalc(id);
        Book currentBook;
        for (Book b : books[index]) {
            if(b.getId() == id) {
                currentBook = b;
                return currentBook;
            }
        }
        return null;
    }

    public boolean removeBook(int id) {
       int index = getIndexByHashCalc(id);

       LinkedList<Book> linkedList = books[index];

       Book removeBook = getBookById(id);
       return linkedList.remove(removeBook);
    }

    public LinkedList<Book> getLinkedListAtPos(int pos) {
        //TODO: einkommentieren
        //return list[pos];
        return null;
    }

    private int getIndexByHashCalc(int id) {
        //TODO: einkommentieren
        //return id % list.length;
        return 0;
    }
}

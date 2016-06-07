
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection = new ArrayList<Book>();

    public Library() {

    }

    public void addBook(Book newBook) {
        this.collection.add(newBook);
    }

    public void printBooks() {
        for (Book book : collection) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        return searchBook(title, null, -1);
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        return searchBook(null, publisher, -1);
    }

    public ArrayList<Book> searchByYear(int year) {
        return searchBook(null, null, year);
    }

    public ArrayList<Book> searchBook(String title, String publisher, int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book book : collection) {
            if (StringUtils.included(book.title(), title) || StringUtils.included(book.publisher(), publisher)
                    || book.year() == year) {
                found.add(book);
            }
        }
        
        return found;
    }
}

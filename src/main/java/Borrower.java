import java.util.ArrayList;

public class Borrower {
    private final String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int numberOfBorrowedBooks() {
        return this.collection.size();
    }

    public void borrowBook(Book book, Library library) {
        library.removeBook(book);
        this.collection.add(book);
    }
}

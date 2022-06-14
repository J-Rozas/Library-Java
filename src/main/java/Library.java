import java.util.ArrayList;

public class Library {
    private final String name;
    private ArrayList<Book> collection;

    public Library(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public int getNumberOfBooks() {
        return this.collection.size();
    }
}

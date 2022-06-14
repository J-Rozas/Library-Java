import java.util.ArrayList;

public class Library {
    private final String name;
    private final int capacity;
    private ArrayList<Book> collection;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (capacity > getNumberOfBooks()) {
            this.collection.add(book);
        }
    }

    public int getNumberOfBooks() {
        return this.collection.size();
    }
}

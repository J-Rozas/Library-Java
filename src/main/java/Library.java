import java.util.ArrayList;
import java.util.HashMap;

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


    public void removeBook(Book book) {
        this.collection.remove(book);
    }

    public HashMap<String, Integer> getNumberOfBooksOfEachGenre() {
        HashMap<String, Integer> output = new HashMap<>();

        for (Book book : this.collection) {
            String genre = book.getGenre();
            if (output.containsKey(genre)) {
                output.put(genre, output.get(genre) + 1);
            } else {
                output.put(book.getGenre(), 1);
            }
        }

        return output;
    }
}

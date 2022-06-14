import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before() {
        book1 = new Book("Title1", "Author1", "Genre1");
        book2 = new Book("Title2", "Author2", "Genre2");
        library = new Library("CodeClan library", 10);
    }

    @Test
    public void hasBooks() {
        library.addBook(book1);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void shouldNotAddBookIfFullCapacity() {
        for (int i = 0; i < 50; i++) {
            library.addBook(book1);
        }
        assertEquals(10, library.getNumberOfBooks());
    }

    @Test
    public void shouldBeAbleToRemoveBook() {
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void shouldBeAbleToGetNumberOfBooksByGenre() {
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book2);
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Genre1", 5);
        expected.put("Genre2", 1);
        assertEquals(expected, library.getNumberOfBooksOfEachGenre());
    }
}

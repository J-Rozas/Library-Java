import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;

    @Before
    public void before() {
        book1 = new Book("Title1", "Author1", "Genre1");
        library = new Library("CodeClan library");
    }

    @Test
    public void hasBooks() {
        library.addBook(book1);
        assertEquals(1, library.getNumberOfBooks);
    }
}

import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;


public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("Title1", "Author1", "Genre1");
    }

    @Test
    public void hasTitle() {
        assertEquals("Title1", book.getTitle());
    }
}

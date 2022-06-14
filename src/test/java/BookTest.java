import org.junit.Before;

import java.awt.print.Book;


public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("Title1", "Author1", "Genre1");
    }

}

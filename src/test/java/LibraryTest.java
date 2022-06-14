import org.junit.Before;

public class LibraryTest {

    private Library library;
    private Book book1;

    @Before
    public void before() {
        book1 = new Book("Title1", "Author1", "Genre1");
        library = new Library();
    }
}

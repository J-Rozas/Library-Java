import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;

    @Before
    public void before() {
        borrower = new Borrower("Joe");
        book1 = new Book("Title1", "Author1", "Genre1");
        library = new Library("CodeClan library", 30);
        library.addBook(book1);
    }

    @Test
    public void hasName() {
        assertEquals("Joe", borrower.getName());
    }

    @Test
    public void hasZeroBooksAtFirst() {
        assertEquals(0, borrower.numberOfBorrowedBooks());
    }

    @Test
    public void shouldBeAbleToBorrowBook() {
        library.borrowBook(book1);
        assertEquals(1, borrower.numberOfBorrowedBooks());
        assertEquals(0, library.getNumberOfBooks());
    }
}

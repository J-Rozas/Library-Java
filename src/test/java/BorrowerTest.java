import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void before() {
        borrower = new Borrower("Joe");
    }

    @Test
    public void hasName() {
        assertEquals("Joe", borrower.getName());
    }

    @Test
    public void hasZeroBooksAtFirst() {
        assertEquals(0, borrower.numberOfBorrowedBooks());
    }
}

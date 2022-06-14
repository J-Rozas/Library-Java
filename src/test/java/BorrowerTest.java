import org.junit.Before;
import org.junit.Test;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void public() {
        borrower = new Borrower("Joe");
    }

    @Test
    public void hasName() {
        assertEquals("Joe", borrower.getName());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

public class jUnitTests {

    @Test // annotation for testing
    public void testIfNameIsAdi() {
        String expected = "Adi";
        String actual = "Adi";

        // testing if one arg is equal to another arg
        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        // what you expect with Math // The way to calc // Margin of error
        assertEquals(5.0, price-discount, 0.5);
        assertNotEquals(4.2, price-discount, 0.5);
    }

}

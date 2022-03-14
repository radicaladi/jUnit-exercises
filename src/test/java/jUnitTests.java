import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class jUnitTests {

    @Test
    public void testStrings() {
        String input = "Codeup";
        String input2 = "CodeUp";

//        assertEquals(input, input2);
        assertNotEquals(input, input2);
    }

    @Test
    public void testArrayLists() {
        List languages = new ArrayList<>();
        List moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testArrays() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
            otherNumbers[0] = 1; otherNumbers[1] = 2;
            otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testBooleans() {
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement

    }

}

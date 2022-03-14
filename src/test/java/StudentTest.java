import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCreatStudent() {
        Student Obj = new Student(133, "Odell");
        Student ObieJ = null;
        assertNull(ObieJ);
        assertNotNull(Obj);
    }
}

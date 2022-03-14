import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCreateStudent() {
        Student Obj = new Student(133, "Odell");
        Student ObieJ = null;
        assertNull(ObieJ);
        assertNotNull(Obj);
    }

    @Test
    public void testStudentFields() {
        Student Jarvis = new Student(80, "Jarvis");
        assertEquals("Jarvis", Jarvis.getName());
        assertEquals(80, Jarvis.getID());
        assertEquals(0, Jarvis.getGrades().size());
    }
}

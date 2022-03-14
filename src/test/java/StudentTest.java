import org.junit.Test;


import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCreateStudent() {
        Student Obj = new Student(1303, "Odell");
        Student ObieJ = null;
        assertNull(ObieJ);
        assertNotNull(Obj);
    }

    @Test
    public void testStudentFields() {
        Student Jarvis = new Student(8014, "Jarvis");
        assertEquals("Jarvis", Jarvis.getName());
        assertEquals(8014, Jarvis.getID());
        assertEquals(0, Jarvis.getGrades().size()); // tests if arraylist is created with no inputs
    }

    @Test
    public void testAddGrade() {
        Student Jarvis = new Student(8014, "Jarvis");
        Jarvis.addGrade(80);
        assertSame(80, Jarvis.getGrades().get(0));
    }
}

import java.util.ArrayList;

public class Student {
    private long studentId;
    private String studentName;
    private ArrayList<Integer> studentGrades;

    public Student(long studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGrades = new ArrayList<>();
    }
}

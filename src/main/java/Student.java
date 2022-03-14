import java.util.ArrayList;

public class Student {
    private long studentID;
    private String studentName;
    private ArrayList<Integer> grades;

    public Student(long studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public long getID() {
        return this.studentID;
    }

    public String getName() {
        return this.studentName;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
}

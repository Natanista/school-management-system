import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static Double totalMoneyEarned = 0.0;
    private static Double totalMoneySpent = 0.0;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;

    }

    public static void updateTotalMoneyEarned(Double moneyEarned){
        totalMoneyEarned += moneyEarned;
    }

    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }



    public Double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(Double moneySpent) {
        totalMoneySpent += moneySpent;
    }

    @Override
    public String toString() {
        return "School{" +
                "teachers=" + teachers +
                ", students=" + students +
                ", totalMoneyEarned=" + totalMoneyEarned +
                ", totalMoneySpent=" + totalMoneySpent +
                '}';
    }
}

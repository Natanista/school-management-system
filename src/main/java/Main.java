import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher natan = new Teacher(1L,"Natan", 20000.0);
        Teacher carlos = new Teacher(2L,"Carlos", 12000.0);
        Teacher maria = new Teacher(3L,"Maria", 13000.0);

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(natan);
        teacherList.add(carlos);
        teacherList.add(maria);

        Student liza = new Student(1L,"Liza", 12);
        Student bart = new Student(2L,"Bart", 3);
        Student mart = new Student(3L,"Mart", 4);

        List<Student> studentList = new ArrayList<>();

        studentList.add(liza);
        studentList.add(bart);
        studentList.add(mart);



        liza.payFees(200.0);

        School yale = new School(teacherList, studentList);
        System.out.println("Yale has earned  $" + yale.getTotalMoneyEarned());

        System.out.println("--MAKING SCHOOL PAY SALARY--");
        natan.receiveSalary(natan.getSalary());
        maria.receiveSalary(maria.getSalary());
        carlos.receiveSalary(carlos.getSalary());
        System.out.println("Yale paid total of: $" + yale.getTotalMoneySpent());




    }
}

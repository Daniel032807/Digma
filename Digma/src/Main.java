import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Maria Santos",
                "BS Information Technology", 95.50);

        Student student2 = new Student("Pedro Cruz",
                "BS Information Technology", 88.75);

        Student student3 = new Student("Anna Reyes",
                "BS Computer Science", 92.00);

        Student student4 = new Student("John Garcia",
                "BS Information Technology", 78.50);

        Student student5 = new Student("Sofia Lopez",
                "BS Computer Science", 96.25);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("==========================================");
        System.out.println("     GENERIC STUDENT GRADE MANAGEMENT");
        System.out.println("==========================================");
        System.out.println();
        System.out.println("STUDENT GRADE REPORT");
        System.out.println("------------------------------------------");

        for (Student student : students) {
            student.displayStudentInfo();
        }

        System.out.println("Total Students: " + students.size());
        System.out.println("==========================================");
    }
}

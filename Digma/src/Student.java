public class Student {
    String name;
    String course;
    GradeBox<Double> grade;

    public Student(String name, String course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = new GradeBox<>(grade);
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade.getGrade());
        System.out.println("Grade as Double: " +
                GradeProcessor.convertToDouble(grade.getGrade()));
        System.out.println("Status: " +
                (GradeProcessor.isPassing(grade.getGrade()) ? "PASSED" : "FAILED"));
        System.out.println();
    }
}

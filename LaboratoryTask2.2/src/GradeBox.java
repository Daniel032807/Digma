public class GradeBox<T extends Number> {
    private T grade;

    public GradeBox(T grade) {
        this.grade = grade;
    }

    public T getGrade() {
        return grade;
    }

    public void setGrade(T grade) {
        this.grade = grade;
    }

    public double getNumericGrade() {
        return grade.doubleValue();
    }
}

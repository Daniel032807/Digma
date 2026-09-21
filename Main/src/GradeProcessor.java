public class GradeProcessor {

    public static <T extends Number> double convertToDouble(T value) {
        return value.doubleValue();
    }

    public static <T extends Number> boolean isPassing(T grade) {
        return grade.doubleValue() >= 75.00;
    }
}

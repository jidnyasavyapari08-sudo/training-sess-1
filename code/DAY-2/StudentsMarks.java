public class StudentsMarks {
    public static void main(String[] args) {
        double english = 20;
        double maths = 25;
        double history = 30;
        double science = 40;
        double geography = 26;

        double total = english + maths + history + science + geography;
        double average = total / 5;

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}

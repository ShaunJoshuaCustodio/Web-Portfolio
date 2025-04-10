public class GradeChecker {
    public static void main(String[] args) {
        int grade = 88;

        if (grade >= 90) {
            System.out.println("Excellent!");
        } else if (grade >= 80) {
            System.out.println("Good!");
        } else if (grade >= 70) {
            System.out.println("Average.");
        } else {
            System.out.println("Needs Improvement.");
        }
    }
}
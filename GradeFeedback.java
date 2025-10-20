import java.util.Scanner;

public class GradeFeedback {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's grade (0-100): ");
        int grade = scanner.nextInt();
        String feedback = "";
        String lettergrade = "";

        if (grade >= 90) {
            lettergrade = "A";
            feedback = "Excellent!";
        } else if (grade >= 80) {
            lettergrade = "B";
            feedback = "Good job!";
        } else if (grade >= 70) {
            lettergrade = "C";
            feedback = "Fair effort.";
        } else if (grade >= 60) {
            lettergrade = "D";
            feedback = "Needs improvement.";
        } else {
            lettergrade = "F";
            feedback = "Failing grade.";
        }

        System.out.println("Grade: " + lettergrade);
        System.out.println("Feedback: " + feedback);

        scanner.close();
    }
}

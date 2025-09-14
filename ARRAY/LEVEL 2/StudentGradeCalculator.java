import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            System.out.print("Physics: ");
            physicsMarks[i] = scanner.nextInt();
            while (physicsMarks[i] < 0) {
                System.out.println("Marks cannot be negative. Please enter positive values.");
                System.out.print("Physics: ");
                physicsMarks[i] = scanner.nextInt();
            }

            System.out.print("Chemistry: ");
            chemistryMarks[i] = scanner.nextInt();
            while (chemistryMarks[i] < 0) {
                System.out.println("Marks cannot be negative. Please enter positive values.");
                System.out.print("Chemistry: ");
                chemistryMarks[i] = scanner.nextInt();
            }

            System.out.print("Maths: ");
            mathsMarks[i] = scanner.nextInt();
            while (mathsMarks[i] < 0) {
                System.out.println("Marks cannot be negative. Please enter positive values.");
                System.out.print("Maths: ");
                mathsMarks[i] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numStudents; i++) {
           
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (double) totalMarks / 3;

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.println("\nStudent Results:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-12d %-10.2f %-10c\n", (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }
        System.out.println("--------------------------------------------------");

        scanner.close();
    }
}

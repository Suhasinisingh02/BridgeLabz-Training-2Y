public class StudentMarks2DArray {

    public static void main(String[] args) {
        
        int[][] studentMarks = {
                {80, 75, 90}, 
                {90, 85, 78}, 
                {70, 60, 75} 
        };

        int numberOfStudents = studentMarks.length;
        int numberOfSubjects = studentMarks[0].length; 

        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < numberOfSubjects; j++) {
                totalMarks += studentMarks[i][j];
            }

            double percentage = (double) totalMarks / (numberOfSubjects * 100) * 100; 

            String grade = calculateGrade(percentage);

            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Percentage: " + percentage + "%");
            System.out.println("  Grade: " + grade);
            System.out.println();
        }
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}

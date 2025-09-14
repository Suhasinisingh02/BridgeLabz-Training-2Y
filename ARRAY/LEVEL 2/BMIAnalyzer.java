import java.util.Scanner;

public class BMIAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        scanner.nextLine();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.println("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for (int i = 0; i < numPersons; i++) {
            bmis[i] = calculateBMI(weights[i], heights[i]);
            weightStatuses[i] = getWeightStatus(bmis[i]);
        }

        System.out.println("\nBMI Analysis:");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmis[i], weightStatuses[i]);
        }
        System.out.println("-----------------------------------------------------");
        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}

import java.util.Scanner;

public class BMIMultiDimensionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[][] personData = new double[numberOfPersons][3]; 

        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter data for person " + (i + 1) + ":");
            
            double weight;
            do {
                System.out.print("Enter weight in kilograms: ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value. Please enter again.");
                }
            } while (weight <= 0);
            personData[i][0] = weight; 

            double height;
            do {
                System.out.print("Enter height in meters: ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value. Please enter again.");
                }
            } while (height <= 0);
            personData[i][1] = height;

            personData[i][2] = calculateBMI(weight, height);

            weightStatus[i] = getWeightStatus(personData[i][2]);
        }

        System.out.println("\n--- BMI Results ---");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("  Weight: " + personData[i][0] + " kg");
            System.out.println("  Height: " + personData[i][1] + " m");
            System.out.println("  BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("  Status: " + weightStatus[i]);
        }

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

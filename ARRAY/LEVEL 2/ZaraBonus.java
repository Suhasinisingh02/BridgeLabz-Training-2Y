import java.util.Scanner;

public class ZaraBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salaries = new double[10];         // To store salaries
        double[] yearsOfService = new double[10];   // FIX: Added array for years of service
        double[] newSalaries = new double[10];      // To store updated salaries after bonus
        double[] bonusAmounts = new double[10];     // To store bonus amounts

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input for 10 employees
        for (int i = 0; i < 10; i++) {
            boolean isValidInput = false;

            while (!isValidInput) {
                System.out.println("Enter salary for employee " + (i + 1) + ":");
                
                // Validate salary input
                if (scanner.hasNextDouble()) {
                    salaries[i] = scanner.nextDouble();
                    if (salaries[i] <= 0) {
                        System.out.println("Invalid salary. Please enter a positive number.");
                        continue; // re-ask for salary
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number for salary.");
                    scanner.next(); // clear invalid input
                    continue;
                }

                // Ask for years of service
                System.out.println("Enter years of service for employee " + (i + 1) + ":");
                if (scanner.hasNextDouble()) {
                    yearsOfService[i] = scanner.nextDouble();
                    if (yearsOfService[i] < 0) {
                        System.out.println("Invalid years of service. Please enter a non-negative number.");
                        continue; // re-ask for years of service
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number for years of service.");
                }
            }
        }
    }
}
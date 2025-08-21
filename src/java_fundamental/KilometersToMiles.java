package java_fundamental;

import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        // Read a double to handle fractional kilometers
        double kilometers;
        if (scanner.hasNextDouble()) {
            kilometers = scanner.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.close();
            return;
        }

        double miles = kilometers * 0.621371;

        System.out.printf("%.2f kilometers is %.4f miles.%n", kilometers, miles);

        scanner.close();
    }
}

import java.util.Scanner;

public class heightConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();

        double heightInInches = heightInCm / 2.54;

        int feet = (int) (heightInInches / 12);
        double remainingInches = heightInInches % 12;

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", heightInCm, feet, remainingInches);

        scanner.close();
    }
}


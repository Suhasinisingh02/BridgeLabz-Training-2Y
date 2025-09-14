import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (number < 0) {
            number = -number; 
        }

        int digitCount = 0;
        long temp = number;
        if (temp == 0) {
            digitCount = 1; 
        } else {
            while (temp > 0) {
                temp /= 10;
                digitCount++;
            }
        }

        int[] digits = new int[digitCount];
        temp = number;
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = (int) (temp % 10); 
            temp /= 10; 
        }

        int[] frequency = new int[10]; 
        for (int digit : digits) {
            frequency[digit]++;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
}

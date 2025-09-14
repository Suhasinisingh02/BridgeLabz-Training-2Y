import java.util.Scanner;

public class largestandsecond {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number > 0) {
            if (index == maxDigit) {
               
                int newMaxDigit = maxDigit + 10;
                int[] tempDigits = new int[newMaxDigit];

                System.arraycopy(digits, 0, tempDigits, 0, maxDigit);

                digits = tempDigits;
                maxDigit = newMaxDigit; 
            }

            digits[index] = (int) (number % 10);
            number /= 10;
            index++;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();
    }
}

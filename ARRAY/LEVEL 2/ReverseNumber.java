import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int numDigits = 0;
        int temp = number; 
        while (temp != 0) {
            temp /= 10;
            numDigits++;
   
        int[] digits = new int[numDigits];
        temp = number; 
        for (int i = 0; i < numDigits; i++) {
            digits[i] = temp % 10; 
            temp /= 10;           
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < numDigits; i++) {
            System.out.print(digits[i]); 
        }
        System.out.println(); 

        scanner.close();
    }
}
}
import java.util.Scanner;

public class question1{
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter the first number: ");
        float number1 = sc.nextFloat();

        System.out.print("Enter the second number: ");
        float number2 = sc.nextFloat();

        // Performing operations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;

        // Handling division by zero
        float division;
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed!");
            division = 0;
        }

        // Displaying the result
        System.out.println("\nThe addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}

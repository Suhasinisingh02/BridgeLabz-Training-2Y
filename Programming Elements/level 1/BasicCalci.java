import java.util.Scanner;

public class BasicCalci{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.printf("The addition, subtraction, multiplication, and division value of two numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n",
                number1, number2, addition, subtraction, multiplication, division);

        scanner.close();
    }
}

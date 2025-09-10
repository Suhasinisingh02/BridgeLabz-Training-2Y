import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        float perimeter = sc.nextFloat();

        // Calculating the side of the square
        float side = perimeter / 4;

        // Displaying the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}

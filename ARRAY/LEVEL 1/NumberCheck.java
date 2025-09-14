import java.util.Scanner;

public class NumberCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nResults:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative");
            } else {
                System.out.println("Number " + num + " is Zero");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison between first and last element:");
        if (first == last) {
            System.out.println("First element (" + first + ") is equal to the last element (" + last + ")");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than the last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is less than the last element (" + last + ")");
        }
        sc.close();
    }
}


package java_fundamental;

import java.util.*;

public class AverageOfThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number:");
        double b = scanner.nextDouble();

        System.out.print("Enter the third number:");
        double c = scanner.nextDouble();

        double average = (a + b + c) / 3.0;

        System.out.println("Average: " + average);

        scanner.close();
    }
}

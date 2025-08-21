package java_fundamental;

import java.util.*;

public class RectanglePerimeter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length:");
        double length = scanner.nextDouble();

        System.out.print("Enter the width:");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter = " + perimeter);

        scanner.close();
    }
}

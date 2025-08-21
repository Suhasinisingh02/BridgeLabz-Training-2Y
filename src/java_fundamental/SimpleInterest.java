package java_fundamental;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal (P):");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate (R) in percent:");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (T) in years:");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100.0;

        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
    }
}

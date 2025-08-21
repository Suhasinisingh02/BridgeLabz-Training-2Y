package java_fundamental;

import java.util.Scanner;

public class SelfProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base:");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent:");
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " = " + result);
    }

    private static double power(double base, int exp) {

        if (exp == 0) return 1.0;

        boolean negative = exp < 0;
        int absExp = negative ? -exp : exp;

        double half = power(base, absExp / 2);
        double full = half * half;

        if ((absExp & 1) == 1) {
            full = full * base;
        }
        return negative ? 1.0 / full : full;

    }
}
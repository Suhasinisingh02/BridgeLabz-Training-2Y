import java.util.Scanner;
public class StudentfeeDiscount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Student Fee (INR): ");
        int fee = sc.nextInt();

        System.out.print("Enter the University Discount percentage: ");
        int discountPercent = sc.nextInt();

        double discount = ((double) discountPercent / 100) * fee;

        int discountedFee = fee - (int) discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %d%n", discount,
                discountedFee);

        sc.close();
    }
}

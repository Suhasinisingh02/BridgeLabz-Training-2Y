public class DiscountCal {

    public static void main(String[] args) {

        int fee = 125000;
        int discountPercent = 10;
        int discount = fee * discountPercent / 100;
        int discountedPrice = fee - discount;

        System.out.println("Original Fee: INR " + fee);
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Discount Amount: INR " + discount);
        System.out.println("Discounted Price: INR " + discountedPrice);
    }
}


public class kilometerToMiles {
    public static void main(String[] args){
        float kilometers = 10.8f;

        float milesPerKilometer = 0.621371f;

        float miles = kilometers * milesPerKilometer;

        System.out.printf("The distance %.2f km in miles is %.2f\n", kilometers, miles);
    }
}

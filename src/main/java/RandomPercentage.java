import java.util.Random;
import java.text.DecimalFormat;

public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        Random generator = new Random();

        // 2. One Random object with any seed value (seeded)
        Random generator1 = new Random(2);

        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        double obj1 = generator.nextDouble();
        double obj2 = generator1.nextDouble();

        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        obj1 *= 100;
        obj2 *= 100;

        // Display with % symbol
        System.out.println("Unseeded Random: " + df.format(obj1) + "%");
        System.out.println("Seeded Random: " + df.format(obj2) + "%");

        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
    }
}
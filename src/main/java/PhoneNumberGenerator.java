import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        Random generator = new Random();
        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        int digit1 = generator.nextInt(8);
        int digit2 = generator.nextInt(8);
        int digit3 = generator.nextInt(8);


        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        int digit4 = generator.nextInt(8);
        int digit5 = generator.nextInt(5);
        int digit6 = generator.nextInt(3);
        
        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        int digit7 = generator.nextInt(10);
        int digit8 = generator.nextInt(10);
        int digit9 = generator.nextInt(10);
        
        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
        System.out.printf("%d%d%d-%d%d%d-%d%d%d%n", digit1, digit2, digit3, digit4, digit5, digit6, digit7, digit8, digit9);
    }
}

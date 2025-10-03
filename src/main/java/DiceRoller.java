import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        // TODO: Create Random objects for dice rolling
        Random generator = new Random();
        int dice1 = generator.nextInt(6) +1;
        int dice2 = generator.nextInt(6) +1;
        int dice3 = generator.nextInt(6) +1;
        // 1. Three Random objects without seeds (unseeded dice)
        System.out.println("Unseeded Die 1: " + dice1);
        System.out.println("Unseeded Die 2: " + dice2);
        System.out.println("Unseeded Die 3: " + dice3);

        // 2. One Random object with any seed value (seeded die)
        Random generator1 = new Random(2);
        int dice4 = generator1.nextInt(6) + 1;
        System.out.println("Seeded Die 3: " + dice4);
        // TODO: Generate random integers for dice rolls
        
        // TODO: Display the dice rolls - 1-6
        // Show all four dice rolls with clear labels
        
        // TODO: Demonstrate the difference between seeded and unseeded
        // Run the program multiple times to show seeded consistency
    }
}

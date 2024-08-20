import java.util.Random;

public class SeatNumberGenerator {

    public static void main(String[] args) {
        String randomSeatNumber = generateRandomSeatNumber();
        System.out.println("Random Seat Number: " + randomSeatNumber);
    }

    private static String generateRandomSeatNumber() {
        // Define possible letters for the seat value
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Define the possible digits for the seat value
        String digits = "0123456789";

        // Create a StringBuilder to build the seat value
        StringBuilder seatNumberBuilder = new StringBuilder();

        // Generate a random letter for the seat value
        Random random = new Random();
        char randomLetter = letters.charAt(random.nextInt(letters.length()));
        seatNumberBuilder.append(randomLetter);

        // Generate 1 to 3 random digits for the seat value
        int numDigits = random.nextInt(3) + 1; // Generates a random number between 1 and 3
        for (int i = 0; i < numDigits; i++) {
            char randomDigit = digits.charAt(random.nextInt(digits.length()));
            seatNumberBuilder.append(randomDigit);
        }

        // Combine the letter and digits to form the seat value
        String seatNumber = seatNumberBuilder.toString();

        return seatNumber;
    }
}




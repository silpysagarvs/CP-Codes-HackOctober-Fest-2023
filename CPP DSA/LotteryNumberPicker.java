import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryNumberPicker {
    public static void main(String[] args) {
        // Define the number of lottery numbers to pick and the range
        final int NUMBER_OF_NUMBERS = 6;
        final int MAX_NUMBER = 49;

        // Use a Set to store the unique numbers
        Set<Integer> lotteryNumbers = new HashSet<>();

        // Random number generator
        Random random = new Random();

        // Generate random unique numbers
        while (lotteryNumbers.size() < NUMBER_OF_NUMBERS) {
            int number = random.nextInt(MAX_NUMBER) + 1;
            lotteryNumbers.add(number);
        }

        // Display the picked numbers
        System.out.println("Your lottery numbers are: " + lotteryNumbers);
    }
}

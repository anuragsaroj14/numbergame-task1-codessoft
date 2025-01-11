import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 5; 
        int rounds = 3;

        for (int round = 1; round <= rounds; round++) {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nRound " + round + ":");

            while (attempts < maxAttempts && !guessed) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
                    guessed = true;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessed) {
                System.out.println("Sorry, you ran out of attempts. The number was: " + targetNumber);
            }
        }

        scanner.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess (1-100): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
            }
        }

        System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
    }
}

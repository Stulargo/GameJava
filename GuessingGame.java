import java.util.Scanner;

public class GuessingGame {
    private static final int MAX_ATTEMPTS = 3;
    private int secretNumber;
    private Scanner scanner;

    public GuessingGame() {
        // Initialize the game
        secretNumber = (int) (Math.random() * 10) + 1;
        scanner = new Scanner(System.in);
    }

    public boolean play() {
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess the secret number between 1 and 10.");

        for (int attempts = 1; attempts <= MAX_ATTEMPTS; attempts++) {
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the secret number!");
                return true;
            } else {
                System.out.println("Incorrect guess. Try again.");
            }
        }

        System.out.println("Sorry, you've run out of attempts. The secret number was: " + secretNumber);
        return false;

    }

}

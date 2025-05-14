import java.util.*;

public class ModifiedGame{
    // Global objects for random number generation and user input
    public static Random rand = new Random();
    public static Scanner input = new Scanner(System.in);
    
    // Game variables
    public static int targetNumber, level = 1, score = 0, highScore = 0;
    public static final int MAX_ATTEMPTS = 5; // Maximum guesses allowed per level

    /**
     * Displays the welcome message and game instructions.
     */
    public static void welcome() {
        System.out.println("\n\n******** WELCOME TO THE GUESSING GAME by JAGOUM ********");
        System.out.println("You will start from Level 1 and progress as you win.");
        System.out.println("Try to guess the correct number in limited attempts!");
        System.out.println("Highest Score will be recorded.\n");
    }

    /**
     * Initializes a new level by setting a random target number.
     */
    public static void setLevel() {
        switch (level) {
            case 1:
                targetNumber = rand.nextInt(10) + 1; // Random number between 1-10
                System.out.println("\n***** LEVEL 1 *****\nEnter a number between 1-10");
                break;
            case 2:
                targetNumber = rand.nextInt(20) + 1; // Random number between 1-20
                System.out.println("\n***** LEVEL 2 *****\nEnter a number between 1-20");
                break;
            case 3:
                targetNumber = rand.nextInt(30) + 1; // Random number between 1-30
                System.out.println("\n***** LEVEL 3 *****\nEnter a number between 1-30");
                break;
            default:
                System.out.println("\nCongratulations! You've completed all levels!");
                System.out.println("Final High Score: " + highScore);
                System.exit(0); // Ends the game when all levels are completed
        }
    }

    /**
     * Handles the gameplay where the user guesses the target number.
     */
    public static void playGame() {
        int attempts = 0; // Tracks the number of user attempts
        
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            if (guess == targetNumber) {
                score = (MAX_ATTEMPTS - attempts) * level; // Score based on attempts left
                System.out.println("\nCorrect! The number was " + targetNumber);
                System.out.println("You win Level " + level + " with a score of " + score);

                // Update high score if current score is greater
                if (score > highScore) {
                    highScore = score;
                    System.out.println("New highest score: " + highScore);
                }

                level++; // Move to the next level
                return;  // Exit function to proceed to the next level
            } else {
                System.out.println("Wrong guess! Try again.");
            }
            attempts++;
        }

        // If user fails to guess within attempts, they lose
        System.out.println("\nToo many wrong guesses. You lose! The number was " + targetNumber);
        System.out.println("Your final score: " + score);
        
        // Offer replay after losing
        replayGame();
    }

    /**
     * Prompts the user if they want to play again.
     */
    public static void replayGame() {
        while (true) {
            System.out.print("\nWould you like to play again? [yes/no]: ");
            String answer = input.next().trim().toLowerCase();

            if (answer.equals("yes")) {
                level = 1; // Reset level
                score = 0; // Reset score
                System.out.println("\nStarting a new game...");
                return; // Restart game loop
            } else if (answer.equals("no")) {
                System.out.println("\nThanks for playing! See you next time.");
                System.exit(0); // Exit game
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
    }

    /**
     * Main method to run the game.
     */
    public static void main(String[] args) {
        welcome(); // Display welcome message
        
        while (true) { // Continuous game loop until user quits
            setLevel(); // Setup new level
            playGame(); // Play the current level
        }
    }
}

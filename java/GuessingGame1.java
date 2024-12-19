import java.util.*;
import java.util.Random;

public class GuessingGame1 {
    /*
     * Requirements
     * Changing levels
     * calculating high score
     * keeping high score for every session as the game goes on
     * add option for two user but it depends
     */
    public static Random rand = new Random();
    public static Scanner input = new Scanner(System.in);
    public static int guessNum, score = 0, highScore, option;
    public static int machineNum, level, i = 0;

    public static void welcome() {
        System.out.println(
                "\n\n\t\t************** WELCOME TO GUESSING GAME by JAGOUM ******************\n\n\nChoose:\n\n1 for Level 1\n2 for Level 2\n3 for Level 3\n4 To see highest score\n");

    }

    // selecting levels
    public static void selectLevel() {
        loop: while (true) {
            System.out.print("Option : ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    level = 1;
                    machineNum = rand.nextInt(10) + 1;
                    System.out.println("\t\t***** LEVEL 1 *****\n\n\nEnter a number in the range 1-10\n\n");

                    break loop;
                case 2:
                    machineNum = rand.nextInt(20) + 1;
                    level = 2;
                    System.out.println("\t\t****** LEVEL 2 *****\n\n\nEnter a number in the range 1-20\n\n");

                    break loop;
                case 3:
                    level = 3;
                    machineNum = rand.nextInt(30) + 1;
                    System.out.println("\t\t*****LEVEL 3 *****\n\n\nEnter a number in the range 1-30\n\n");

                    break loop;
                case 4:
                    System.out.println("\n\nHigh Score: " + highScore);
                    break loop;
                default:
                    System.out.println("Please enter one of the above options");
                    break;
            }
        }
    }

    public static void playGame() {
        if (option > 0 && option < 4) {
            do {
                System.out.println("Please enter a number to guess : ");
                guessNum = input.nextInt();
                System.out.println("\nWrong guess!!! \n");
                i++;
            } while (guessNum != machineNum && i != 5);
            if (i == 5) {
                System.out.println("\nToo many wrong guess.\nYou lose !!!\nThe number was " + machineNum);
            } else {
                System.out.printf("\nCorrect guess %d.\n\nYou win with a score of %d", machineNum,(((5 - i) + 1) * level));
                score = (((5 - i) + 1) * level);
                if (score > highScore) {
                    highScore = score;
                    System.out.println("\n\nNew highest score = " + score);
                }
            }
        }
        // welcome();

    }

    public static void main(String[] args) {
        // Declaring and initailizing machineNum = rand.nextInt(10) + 1;

        welcome();
        selectLevel();
        playGame();
        while (true) {

            System.out.println("\nWill you like to continue  [yes/no] ? \n");
            String answer = input.next();

            if (answer.equals("yes")) {
                System.out.println("\t\t ***** AWESOME ***** \n\n");
                welcome();
                selectLevel();
                playGame();
            } else if (answer.equals("no")) {
                System.out.println("\t\t ~~~ Thanks for Playing see you next time bye ~~~ \n\n");
                break;
            } else {
                System.out.println("Please either yes or no to continue ");
            }

        }
        input.close();

    }
}

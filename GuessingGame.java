import java.util.*;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        // Declaring and initailizing variables
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int machineNum = rand.nextInt(10) + 1;
        int level;
        int guessNum;
        int i = 0;

        



        do {
            System.out.println("Please enter a number to guess : ");
            guessNum = input.nextInt();
            i++;
        } while (guessNum != machineNum && i != 3);
        if (i == 3) {
            System.out.println("Too many wrong guess.\nYou lose !!!\nThe number was " + machineNum);
        } else {
            System.out.printf("Correct guess %d.\n You win with a score of %d", machineNum, 3 - i);
        }

        // if (machineNum == guessNum)
        // {
        // System.out.println("Correct Guess");
        // }
        // else
        // {
        // System.out.println("Wrong Guess");
        // }
        input.close();
    }

}
import java.util.Random;
import java.util.Scanner;

public class Guessing {

    public static void main(String[] args) {
        int trial = 0;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int random_number = rand.nextInt(1, 5);

        while (trial != 3) {
            System.out.println("Guest a number between 1 - 5: ");
            int num = input.nextInt();
            if (num == random_number) {
                System.out.println("Correct guess you won");
                break;
            }
            System.out.println("Wrong Guest Try again");
            trial ++;
        }
        if (trial == 3) {
            System.out.println(" You loose . The number was " + random_number);
        }
        input.close();
    }
}
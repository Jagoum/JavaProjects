import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        int number, limit;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number :");
        number = input.nextInt();
        System.out.println("Please enter the limit :");
        limit = input.nextInt();
        System.out.println("\t Multiplication Time Table \n\n");
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.printf("%d X %d = %d\n", j, i, i * j);
            }
            System.out.println("\n");
        }
        input.close();
    }
}

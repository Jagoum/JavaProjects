import java.util.*;

class first {

    public static void main(String[] args) {
        char operator;
        Double number1, number2;
        // creating a scanner class used to accept input from a user
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the first number ");
        number1 = input.nextDouble();
        System.out.println("Please enter the second number");
        number2 = input.nextDouble();
        System.out.println("Please enter an operator format[+,-,*,/]");
        operator = input.next().charAt(0);
        // selecting the operator to be used
        switch (operator) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", number1, number2, number1 + number2);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", number1, number2, number1 - number2);
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", number1, number2, number1 * number2);
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Sorry but division by zero is not defined");
                } else {

                    System.out.printf("%.2f + %.2f = %.2f", number1, number2, number1 / number2);
                }
                break;
            default:
                System.out.println("You must choose one valid operator from the list");
                break;

        }
input.close();
    }
}
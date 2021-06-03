package Java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter two numbers : ");

        double first = scanner.nextDouble();
        double Second = scanner.nextDouble();

        System.out.println(" please enter a operator : (+,-,*,/ ): " );
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = first + Second;
                break;
            case '-':
                result = first - Second;
                break;
                case '*':
                result = first * Second;
                break;
                case '/':
                result = first / Second;
                break;
                
            default :
                System.out.println(" please pass the correct operator ");
                break;
        }
        System.out.println(result);
    }
}

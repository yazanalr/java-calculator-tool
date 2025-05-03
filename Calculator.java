import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %, ^): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                System.out.print("Enter second number: ");
                double addNum = scanner.nextDouble();
                result = num1 + addNum;
                break;
            case '-':
                System.out.print("Enter second number: ");
                double subNum = scanner.nextDouble();
                result = num1 - subNum;
                break;
            case '*':
                System.out.print("Enter second number: ");
                double mulNum = scanner.nextDouble();
                result = num1 * mulNum;
                break;
            case '/':
                System.out.print("Enter second number: ");
                double divNum = scanner.nextDouble();
                if (divNum == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / divNum;
                break;
            case '%':
                System.out.print("Enter second number: ");
                double modNum = scanner.nextDouble();
                if (modNum == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 % modNum;
                break;
            case '^':
                result = num1 * num1;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println("Result: " + result);
    }}

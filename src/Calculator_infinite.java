import java.util.Scanner;
public class Calculator_infinite {
    public static Scanner scanner = new Scanner(System.in);

    public static int inputNumber() {
        System.out.println("Введите число:");
        int operand = scanner.nextInt();
        return operand;
    }

    public static char inputOperation() {
        System.out.println("Выберите операцию:");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static int calculate(int operand1, char operation, int operand2) {
        int result = 0;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
        }
        return result;
    }
}
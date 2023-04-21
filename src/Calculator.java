
import java.util.Scanner;
public class Calculator {
    public static void main (String[] args) { int result;
        char operation;


        result = Calculator_infinite.calculate(Calculator_infinite.inputNumber(), Calculator_infinite.inputOperation(), Calculator_infinite.inputNumber());
        System.out.println(result);


        while (true) {
            operation = Calculator_infinite.inputOperation();
            if (operation == 'C') {
                result = 0;
            } else if (operation == 's') {
                System.out.println("Выход");
                break;
            }  else {
                result = Calculator_infinite.calculate(result, operation, Calculator_infinite.inputNumber());
                System.out.println("Результат = " + result);
            }

        }

    }
}

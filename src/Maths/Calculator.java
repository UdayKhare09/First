package Maths;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public void calculator() {
        Operators operators = new Operators();
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        while (true) {
            System.out.println("Enter a number: ");
            a = scanner.nextInt();
            System.out.println("Enter an operator: ");
            String operator = scanner.next();
            if (!Objects.equals(operator, "+") && !Objects.equals(operator, "-") && !Objects.equals(operator, "*") && !Objects.equals(operator, "/")) {
                System.out.println("Invalid operator");
                break;
            }
            System.out.println("Enter another number: ");
            b = scanner.nextInt();
            switch (operator) {
                case "+" -> System.out.println(operators.add(a, b));
                case "-" -> System.out.println(operators.subtract(a, b));
                case "*" -> System.out.println(operators.multiply(a, b));
                case "/" -> System.out.println(operators.divide(a, b));
                default -> System.out.println("Invalid operator");
            }
        }
    }
}

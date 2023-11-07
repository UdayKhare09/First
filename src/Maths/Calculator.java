package Maths;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void calculator() {
        Math operators = new Math();
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
            System.out.println("Do you want to continue? (y/n)");
            String playAgain = new java.util.Scanner(System.in).next();
            if (playAgain.equals("n")) {
                break;
            }
        }
    }
}

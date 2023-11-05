package Maths;

public class MathMenu {
    public static void mathmenu() {
        while (true) {
            System.out.println("1. Calculator");
            System.out.println("2. Main Menu");
            System.out.println("Enter your choice: ");
            int choice = new java.util.Scanner(System.in).nextInt();
            if (choice == 1) {
                Calculator calculator = new Calculator();
                calculator.calculator();
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice");

            }
        }
    }
}
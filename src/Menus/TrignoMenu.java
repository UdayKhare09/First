package Menus;

import Maths.*;
public class TrignoMenu {
    public static void trignomenu() {
        Trigonometry Trignomentry = new Trigonometry();
        while (true) {
            System.out.println("Welcome to the Trignomentry Menu");
            System.out.println("1. Sin");
            System.out.println("2. Cos");
            System.out.println("3. Tan");
            System.out.println("4. Cosec");
            System.out.println("5. Sec");
            System.out.println("6. Cot");
            System.out.println("7. Arcsin");
            System.out.println("8. Arccos");
            System.out.println("9. Arctan");
            System.out.println("10. Arccosec");
            System.out.println("11. Arcsec");
            System.out.println("12. Arccot");
            System.out.println("13. Sinh");
            System.out.println("14. Cosh");
            System.out.println("15. Tanh");
            System.out.println("16. Cosech");
            System.out.println("17. Sech");
            System.out.println("18. Coth");
            System.out.println("19. Back");
            System.out.println("Enter your choice: ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.println("Enter the angle: ");
            switch (choice) {
                case 1 -> System.out.println("Your result is "+ Trignomentry.sin(scanner.nextDouble()));
                case 2 -> System.out.println("Your result is "+ Trignomentry.cos(scanner.nextDouble()));
                case 3 -> System.out.println("Your result is "+ Trignomentry.tan(scanner.nextDouble()));
                case 4 -> System.out.println("Your result is "+ Trignomentry.cosec(scanner.nextDouble()));
                case 5 -> System.out.println("Your result is "+ Trignomentry.sec(scanner.nextDouble()));
                case 6 -> System.out.println("Your result is "+ Trignomentry.cot(scanner.nextDouble()));
                case 7 -> System.out.println("Your result is "+ Trignomentry.arcsin(scanner.nextDouble()));
                case 8 -> System.out.println("Your result is "+ Trignomentry.arccos(scanner.nextDouble()));
                case 9 -> System.out.println("Your result is "+ Trignomentry.arctan(scanner.nextDouble()));
                case 10 -> System.out.println("Your result is "+ Trignomentry.arccosec(scanner.nextDouble()));
                case 11 -> System.out.println("Your result is "+ Trignomentry.arcsec(scanner.nextDouble()));
                case 12 -> System.out.println("Your result is "+ Trignomentry.arccot(scanner.nextDouble()));
                case 13 -> System.out.println("Your result is "+ Trignomentry.sinh(scanner.nextDouble()));
                case 14 -> System.out.println("Your result is "+ Trignomentry.cosh(scanner.nextDouble()));
                case 15 -> System.out.println("Your result is "+ Trignomentry.tanh(scanner.nextDouble()));
                case 16 -> System.out.println("Your result is "+ Trignomentry.cosech(scanner.nextDouble()));
                case 17 -> System.out.println("Your result is "+ Trignomentry.sech(scanner.nextDouble()));
                case 18 -> System.out.println("Your result is "+ Trignomentry.coth(scanner.nextDouble()));
                case 19 -> MathMenu.mathmenu();
                default -> System.out.println("Invalid choice");

            }
        }
    }
}
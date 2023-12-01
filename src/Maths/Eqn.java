package Maths;

import Menus.MainMenu;
import Menus.MathMenu;

public class Eqn {
    static double a;
    static double b;
    static double c;
    static double d;

    public static void eqn() {
        while (true) {
            System.out.println("1. Quadratic equation");
            System.out.println("2. Cubic equation");
            System.out.println("3. Back");
            System.out.println("Enter your choice: ");
            int choice = new java.util.Scanner(System.in).nextInt();
            if (choice == 1) {
                System.out.println("Enter the coefficients of the quadratic equation");
                System.out.println("ax^2 + bx + c = 0");
                System.out.println("Enter a");
                a = new java.util.Scanner(System.in).nextDouble();
                System.out.println("Enter b");
                b = new java.util.Scanner(System.in).nextDouble();
                System.out.println("Enter c");
                c = new java.util.Scanner(System.in).nextDouble();
                quadratic(a, b, c);
            } else if (choice == 2) {
                System.out.println("Feature not implemented yet");
            } else if (choice == 3) {
                MathMenu.mathmenu();
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void quadratic(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + MathFun.sqrt(d)) / (2 * a);
            double x2 = (-b - MathFun.sqrt(d)) / (2 * a);
            System.out.println("The roots are " + x1 + " and " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("The root is " + x);
        } else {
            System.out.println("The roots are imaginary");
        }
    }
}

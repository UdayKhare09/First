package Maths;

import Menus.MathMenu;

public class Eqn {

    static double x1;
    static double x2;
    static double x3;

    public static void eqn() {
        while (true) {
            System.out.println("1. Quadratic equation");
            System.out.println("2. Cubic equation");
            System.out.println("3. Back");
            System.out.println("Enter your choice: ");
            int choice = new java.util.Scanner(System.in).nextInt();
            double a;
            double b;
            double c;
            double d;
            if (choice == 1) {
                System.out.println("Enter the coefficients of the quadratic equation");
                System.out.println("ax^2 + bx + c = 0");
                System.out.println("Enter a");
                a = new java.util.Scanner(System.in).nextDouble();
                System.out.println("Enter b");
                b = new java.util.Scanner(System.in).nextDouble();
                System.out.println("Enter c");
                c = new java.util.Scanner(System.in).nextDouble();
                double[] roots = quadratic(a, b, c);
                if (roots.length == 1) {
                    System.out.println("The root is " + roots[0]);
                } else if (roots.length == 2) {
                    System.out.println("The roots are " + roots[0] + " and " + roots[1]);
                }
            } else if (choice == 2) {
                System.out.println("Enter the coefficients of the cubic equation");
                System.out.println("ax^3 + bx^2 + cx + d = 0");
                System.out.println("Enter a");
                a = new java.util.Scanner(System.in).nextDouble();
                System.out.println("Enter b");
                b = new java.util.Scanner(System.in).nextDouble();
                System.out.println("Enter c");
                c = new java.util.Scanner(System.in).nextDouble();
                System.out.println("Enter d");
                d = new java.util.Scanner(System.in).nextDouble();
                double[] roots = solveCubicEquation((int) a, (int) b, (int) c, (int) d);
                if (roots.length == 1) {
                    System.out.println("The root is " + roots[0]);
                } else if (roots.length == 2) {
                    System.out.println("The roots are " + roots[0] + " and " + roots[1]);
                } else {
                    System.out.println("The roots are " + roots[0] + ", " + roots[1] + " and " + roots[2]);
                }
            } else if (choice == 3) {
                MathMenu.mathmenu();
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static double[] quadratic(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + MathFun.sqrt(d)) / (2 * a);
            double x2 = (-b - MathFun.sqrt(d)) / (2 * a);
            return new double[]{x1, x2};
        } else if (d == 0) {
            double x = -b / (2 * a);
            return new double[]{x};
        } else {
            return new double[]{};
        }
    }

    public static double[] solveCubicEquation(double A, double B, double C, double D) {

        double a = B / A;
        double b = C / A;
        double c = D / A;

        double p = b - ((a * a) / 3.0);
        double q = (2 * Math.pow(a, 3) / 27.0) - (a * b / 3.0) + c;
        double delta = (Math.pow(q, 2) / 4) + (Math.pow(p, 3) / 27);

        if (delta > 0.001) {
            double mt1, mt2;
            double t1 = (-q / 2.0) + Math.sqrt(delta);
            double t2 = (-q / 2.0) - Math.sqrt(delta);
            if (t1 < 0) {
                mt1 = (-1) * (Math.pow(-t1, (double) 1 / 3));
            } else {
                mt1 = (Math.pow(t1, (double) 1 / 3));
            }
            if (t2 < 0) {
                mt2 = (-1) * (Math.pow(-t2, (double) 1 / 3));
            } else {
                mt2 = (Math.pow(t2, (double) 1 / 3));
            }
            x1 = mt1 + mt2 - (a / 3.0);
            return new double[]{x1};
        } else if (delta < 0.001 && delta > -0.001) {
            if (q < 0) {
                x1 = 2 * Math.pow(-q / 2, (double) 1 / 3) - (a / 3);
                x2 = -1 * Math.pow(-q / 2, (double) 1 / 3) - (a / 3);
            } else {
                x1 = -2 * Math.pow(q / 2, (double) 1 / 3) - (a / 3);
                x2 = Math.pow(q / 2, (double) 1 / 3) - (a / 3);
            }
            return new double[]{x1, x2};
        } else {
            x1 = (2.0 / Math.sqrt(3)) * (Math.sqrt(-p) * Math.sin((1 / 3.0) * Math.asin(((3 * Math.sqrt(3) * q) / (2 * Math.pow(Math.pow(-p, (double) 1 / 2), 3)))))) - (a / 3.0);
            x2 = (-2.0 / Math.sqrt(3)) * (Math.sqrt(-p) * Math.sin((1 / 3.0) * Math.asin(((3 * Math.sqrt(3) * q) / (2 * Math.pow(Math.pow(-p, (double) 1 / 2), 3)))) + (Math.PI / 3))) - (a / 3.0);
            x3 = (2.0 / Math.sqrt(3)) * (Math.sqrt(-p) * Math.cos((1 / 3.0) * Math.asin(((3 * Math.sqrt(3) * q) / (2 * Math.pow(Math.pow(-p, (double) 1 / 2), 3)))) + (Math.PI / 6))) - (a / 3.0);
            return new double[]{x1, x2, x3};
        }
    }
}

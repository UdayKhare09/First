package Maths;

public class MathFun {

    public static double PI = java.lang.Math.PI;

    protected static double sqrt(double v) {
        return java.lang.Math.sqrt(v);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.print("Cannot divide by ");
            return 0;
        }
    }

    public int modulo(int a, int b) {
        try {
            return a % b;
        } catch (ArithmeticException e) {
            System.out.print("Cannot divide by ");
            return 0;
        }
    }

    public int factorial(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }
}


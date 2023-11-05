package Maths;

public class Operators {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.out.print("Cannot divide by ");
            return 0;
        }
    }
}

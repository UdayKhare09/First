package Maths;

public class Geometry extends Math {
    public static double areaOfCircle(double radius) {
        return PI * radius * radius;
    }

    public static double areaOfSquare(double side) {
        return side * side;
    }

    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public double perimeterOfCircle(double radius) {
        return 2 * PI * radius;
    }

    public double perimeterOfSquare(double side) {
        return 4 * side;
    }

    public double perimeterOfRectangle(double length, double breadth) {
        return 2 * (length + breadth);
    }

    public double perimeterOfTriangle(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public double volumeOfCube(double side) {
        return side * side * side;
    }

    public double volumeOfCuboid(double length, double breadth, double height) {
        return length * breadth * height;
    }

    public double volumeOfCylinder(double radius, double height) {
        return PI * radius * radius * height;
    }

    public double volumeOfCone(double radius, double height) {
        return 0.33 * PI * radius * radius * height;
    }

    public double volumeOfSphere(double radius) {
        return 1.33 * PI * radius * radius * radius;
    }

    public double volumeOfHemisphere(double radius) {
        return 0.66 * PI * radius * radius * radius;
    }

    public double volumeOfPyramid(double baseArea, double height) {
        return 0.33 * baseArea * height;
    }

    public double volumeOfPrism(double baseArea, double height) {
        return baseArea * height;
    }

    public double surfaceAreaOfCube(double side) {
        return 6 * side * side;
    }

    public double surfaceAreaOfCuboid(double length, double breadth, double height) {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    public double surfaceAreaOfCylinder(double radius, double height) {
        return 2 * PI * radius * height + 2 * PI * radius * radius;
    }

    public double surfaceAreaOfCone(double radius, double height) {
        return PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    public double surfaceAreaOfSphere(double radius) {
        return 4 * PI * radius * radius;
    }

    public double surfaceAreaOfHemisphere(double radius) {
        return 3 * PI * radius * radius;
    }

    public double surfaceAreaOfPyramid(double baseArea, double basePerimeter, double height) {
        return baseArea + 0.5 * basePerimeter * height;
    }

    public double surfaceAreaOfPrism(double baseArea, double basePerimeter, double height) {
        return 2 * baseArea + basePerimeter * height;
    }
}

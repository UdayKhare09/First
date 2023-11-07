package Maths;

import java.lang.Math;
public class Trigonometry {
    public double sin(double angle) {
        return Math.sin(angle);
    }

    public double cos(double angle) {
        return Math.cos(angle);
    }

    public double tan(double angle) {
        return Math.tan(angle);
    }

    public double cosec(double angle) {
        return 1 / Math.sin(angle);
    }

    public double sec(double angle) {
        return 1 / Math.cos(angle);
    }

    public double cot(double angle) {
        return 1 / Math.tan(angle);
    }

    public double arcsin(double angle) {
        return Math.asin(angle);
    }

    public double arccos(double angle) {
        return Math.acos(angle);
    }

    public double arctan(double angle) {
        return Math.atan(angle);
    }

    public double arccosec(double angle) {
        return 1 / Math.asin(angle);
    }

    public double arcsec(double angle) {
        return 1 / Math.acos(angle);
    }

    public double arccot(double angle) {
        return 1 / Math.atan(angle);
    }

    public double sinh(double angle) {
        return Math.sinh(angle);
    }

    public double cosh(double angle) {
        return Math.cosh(angle);
    }

    public double tanh(double angle) {
        return Math.tanh(angle);
    }

    public double cosech(double angle) {
        return 1 / Math.sinh(angle);
    }

    public double sech(double angle) {
        return 1 / Math.cosh(angle);
    }

    public double coth(double angle) {
        return 1 / Math.tanh(angle);
    }
}

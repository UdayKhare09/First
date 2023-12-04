package Maths;

public class MatrixAdv extends Matrix {

    public static double[][] convertInt2DArrayToDouble2DArray(int[][] int2DArray) {
        int rows = int2DArray.length;
        int columns = int2DArray[0].length;

        double[][] double2DArray = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Cast each int element to double
                double2DArray[i][j] = (double) int2DArray[i][j];
            }
        }
        return double2DArray;
    }

    public static double[] EigenVal(int[][] matE1) {
        double[][] matE = convertInt2DArrayToDouble2DArray(matE1);
        double a = matE[0][0];
        double b = matE[0][1];
        double c = matE[0][2];
        double d = matE[1][0];
        double e = matE[1][1];
        double f = matE[1][2];
        double g = matE[2][0];
        double h = matE[2][1];
        double i = matE[2][2];
        double A = -1;
        double B = a + e + i;
        double C = (d*b) + (g*c) + (h*f) - (a*e) - (a*i) - (e*i);
        double D = (a*e*i) + (d*h*f) + (b*f*g) - (c*e*g) - (h*f*a) - (d*b*i);
        return Eqn.solveCubicEquation(A, B, C, D);
    }
}

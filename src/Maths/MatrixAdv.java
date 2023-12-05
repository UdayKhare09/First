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

    public static double[] eigenVal(int[][] matE1) {
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

    public static double[][] echelonForm(int[][] mat) {
        int numRows = mat.length;
        int numCols = mat[0].length;

        double[][] matEchelon = convertInt2DArrayToDouble2DArray(mat);

        for (int pivotRow = 0; pivotRow < numRows; pivotRow++) {
            double pivotElement = matEchelon[pivotRow][pivotRow];

            // Check for division by zero
            if (pivotElement == 0) {
                // Handle the case where the pivot element is zero
                // You may choose to swap rows, or handle it in a way that suits your needs
                continue;
            }

            // Normalize the pivot row
            for (int j = pivotRow; j < numCols; j++) {
                matEchelon[pivotRow][j] /= pivotElement;
            }

            // Eliminate entries below the pivot
            for (int i = pivotRow + 1; i < numRows; i++) {
                double factor = matEchelon[i][pivotRow];
                for (int j = pivotRow; j < numCols; j++) {
                    matEchelon[i][j] -= factor * matEchelon[pivotRow][j];
                }
            }
        }

        return matEchelon;
    }


}

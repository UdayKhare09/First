package Maths;

import org.apache.commons.math3.linear.*;

import static java.lang.StrictMath.round;

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
        RealMatrix matE = MatrixUtils.createRealMatrix(convertInt2DArrayToDouble2DArray(matE1));
        EigenDecomposition eigenDecomposition = new EigenDecomposition(matE);
        double[] eigenValues = new double[3];
        for (int i = 0; i < eigenDecomposition.getRealEigenvalues().length; i++) {
            System.out.println(round(eigenDecomposition.getRealEigenvalues()[i]));
            eigenValues[i] = round(eigenDecomposition.getRealEigenvalues()[i]);
        }
        return eigenValues;
    }
}

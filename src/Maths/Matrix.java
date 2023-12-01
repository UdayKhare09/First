package Maths;

import Menus.MainMenu;
import Menus.MathMenu;

import java.util.Scanner;

public class Matrix {
    static int[][] matA = new int[3][3];
    static int[][] matB = new int[3][3];
    static int[][] matI = new int[3][3];
    static int[][] matM = new int[3][3];

    public static void matrix() {
        System.out.println("This function is currently under development and works only for 3x3 matrices");
        while (true) {
            System.out.println("Choose an operation");
            System.out.println("1. Matrix A");
            System.out.println("2. Matrix B");
            System.out.println("3. Multiply A and B");
            System.out.println("4. Inverse of Matrix A");
            System.out.println("5. Back");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                while (true) {
                    System.out.println("1. Edit Matrix A");
                    System.out.println("2. View Matrix A");
                    System.out.println("3. Determinant");
                    System.out.println("4. Square");
                    System.out.println("5. Back");
                    choice = scanner.nextInt();

                    if (choice == 1) {
                        matA();
                    } else if (choice == 2) {
                        for (int i = 0; i < matA.length; i++) {
                            for (int j = 0; j < matA[i].length; j++) {
                                System.out.print(matA[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else if (choice == 3) {
                        System.out.println(determinant(matA));
                    } else if (choice == 5) {
                        matrix();
                    } else if (choice == 4) {
                        multiply(matA, matA);
                        System.out.printf("|%d %d %d|\n" +
                                "|%d %d %d|\n" +
                                "|%d %d %d|\n", matM[0][0], matM[0][1], matM[0][2], matM[1][0], matM[1][1], matM[1][2], matM[2][0], matM[2][1], matM[2][2]);
                    } else {
                        System.out.println("Invalid choice");
                    }
                }
            } else if (choice == 2) {
                while (true) {
                    System.out.println("1. Edit Matrix B");
                    System.out.println("2. View Matrix B");
                    System.out.println("3. Determinant");
                    System.out.println("4. Square");
                    System.out.println("5. Back");
                    choice = scanner.nextInt();

                    if (choice == 1) {
                        matB();
                    } else if (choice == 2) {
                        for (int i = 0; i < matB.length; i++) {
                            for (int j = 0; j < matB[i].length; j++) {
                                System.out.print(matB[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else if (choice == 3) {
                        System.out.println(determinant(matB));
                    } else if (choice == 5) {
                        matrix();
                    } else if (choice == 4) {
                        multiply(matB, matB);
                        System.out.printf("|%d %d %d|\n" +
                                "|%d %d %d|\n" +
                                "|%d %d %d|\n", matM[0][0], matM[0][1], matM[0][2], matM[1][0], matM[1][1], matM[1][2], matM[2][0], matM[2][1], matM[2][2]);
                    } else {
                        System.out.println("Invalid choice");
                    }
                }
            } else if (choice == 3) {
                multiply(matA, matB);
                System.out.printf("|%d %d %d|\n" +
                        "|%d %d %d|\n" +
                        "|%d %d %d|\n", matM[0][0], matM[0][1], matM[0][2], matM[1][0], matM[1][1], matM[1][2], matM[2][0], matM[2][1], matM[2][2]);
            } else if (choice == 4) {
                inverse();
                System.out.printf("      |%d %d %d|\n" +
                        "1/%d  |%d %d %d|\n" +
                        "      |%d %d %d|\n", matI[0][0], matI[0][1], matI[0][2], determinant(matA), matI[1][0], matI[1][1], matI[1][2], matI[2][0], matI[2][1], matI[2][2]);

            } else if (choice == 5) {
                MathMenu.mathmenu();
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void matA() {
        System.out.println("Enter the elements");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                matA[i][j] = new java.util.Scanner(System.in).nextInt();
            }
        }
    }

    public static void matB() {
        System.out.println("Enter the elements");
        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB[i].length; j++) {
                matB[i][j] = new java.util.Scanner(System.in).nextInt();
            }
        }
    }

    public static void multiply(int[][] mat1, int[][] mat2) {
        matM[0][0] = mat1[0][0] * mat2[0][0] + mat1[0][1] * mat2[1][0] + mat1[0][2] * mat2[2][0];
        matM[0][1] = mat1[0][0] * mat2[0][1] + mat1[0][1] * mat2[1][1] + mat1[0][2] * mat2[2][1];
        matM[0][2] = mat1[0][0] * mat2[0][2] + mat1[0][1] * mat2[1][2] + mat1[0][2] * mat2[2][2];
        matM[1][0] = mat1[1][0] * mat2[0][0] + mat1[1][1] * mat2[1][0] + mat1[1][2] * mat2[2][0];
        matM[1][1] = mat1[1][0] * mat2[0][1] + mat1[1][1] * mat2[1][1] + mat1[1][2] * mat2[2][1];
        matM[1][2] = mat1[1][0] * mat2[0][2] + mat1[1][1] * mat2[1][2] + mat1[1][2] * mat2[2][2];
        matM[2][0] = mat1[2][0] * mat2[0][0] + mat1[2][1] * mat2[1][0] + mat1[2][2] * mat2[2][0];
        matM[2][1] = mat1[2][0] * mat2[0][1] + mat1[2][1] * mat2[1][1] + mat1[2][2] * mat2[2][1];
        matM[2][2] = mat1[2][0] * mat2[0][2] + mat1[2][1] * mat2[1][2] + mat1[2][2] * mat2[2][2];
    }

    public static void inverse() {
        System.out.println("This function is currently under development and works only for 3x3 matrices");
        if (determinant(matA) == 0) {
            System.out.println("Inverse does not exist");
        } else {
            matI[0][0] = (matA[1][1] * matA[2][2] - matA[1][2] * matA[2][1]);
            matI[0][1] = (matA[0][2] * matA[2][1] - matA[0][1] * matA[2][2]);
            matI[0][2] = (matA[0][1] * matA[1][2] - matA[0][2] * matA[1][1]);
            matI[1][0] = (matA[1][2] * matA[2][0] - matA[1][0] * matA[2][2]);
            matI[1][1] = (matA[0][0] * matA[2][2] - matA[0][2] * matA[2][0]);
            matI[1][2] = (matA[0][2] * matA[1][0] - matA[0][0] * matA[1][2]);
            matI[2][0] = (matA[1][0] * matA[2][1] - matA[1][1] * matA[2][0]);
            matI[2][1] = (matA[0][1] * matA[2][0] - matA[0][0] * matA[2][1]);
            matI[2][2] = (matA[0][0] * matA[1][1] - matA[0][1] * matA[1][0]);
        }
    }

    private static int determinant(int[][] matD) {
        return matD[0][0] * (matD[1][1] * matD[2][2] - matD[1][2] * matD[2][1]) - matD[0][1] * (matD[1][0] * matD[2][2] - matD[1][2] * matD[2][0]) + matD[0][2] * (matD[1][0] * matD[2][1] - matD[1][1] * matD[2][0]);
    }
}


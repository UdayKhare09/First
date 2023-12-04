package Menus;


import Maths.Calculator;

import java.util.Scanner;

public class MathMenu {
    public static void mathmenu() {
        while (true) {
            System.out.println("Welcome to the Maths Menu");
            System.out.println("1. Calculator");
            System.out.println("2. Geometry");
            System.out.println("3. Trigonometry");
            System.out.println("4. Equation solver");
            System.out.println("5. Matrix");
            System.out.println("6. Back");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                Calculator.calculator();
            } else if (choice == 2) {
                GeoMenu.geometry();
            } else if (choice == 3) {
                TrignoMenu.trignomenu();
            } else if (choice == 4) {
                Maths.Eqn.eqn();
            } else if (choice == 5) {
                Maths.Matrix.matrix();
            } else if (choice == 6) {
                MainMenu.mainmenu();
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
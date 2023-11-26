package Menus;

import Resources.Strings;

public class AdminMenu {
    public static void adminmenu() {
        while (true) {
            System.out.println("1. Add a user");
            System.out.println("2. Remove a user");
            System.out.println("3. View all users");
            System.out.println("4. Main Menu");
            System.out.println("Enter your choice: ");
            int choice = new java.util.Scanner(System.in).nextInt();
            if (choice == 1) {
                adduser();
            } else if (choice == 2) {
                removeuser();
            } else if (choice == 3) {
                viewusers();
            } else if (choice == 4) {
                MainMenu.mainmenu();
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    private static void adduser() {
        System.out.println("Feature not implemented yet");
    }

    private static void removeuser() {
        System.out.println("Feature not implemented yet");
    }

    private static void viewusers() {
        int i;
        System.out.println("List of users:");
        System.out.println("Username,Password");
        for (i = 0; i < Strings.loginCredentials.length; i++) {
            System.out.println(Strings.loginCredentials[i]);
        }
    }
}

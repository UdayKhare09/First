
public class MainMenu {
    public static void mainmenu() {
        while (true) {
            System.out.println("Welcome to the Main Menu");
            System.out.println("1. Games");
            System.out.println("2. Maths");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    Games.GamesMenu.gamesmenu();
                }
                case 2 -> {
                    Maths.MathMenu.mathmenu();
                }
                case 3 -> System.exit(0);
            }
        }
    }
}
public class GamesMenu {
    public static void gamesmenu() {
        while (true) {
            System.out.println("1. Guess the number");
            System.out.println("2. Rock, Paper, Scissors");
            System.out.println("3. Main Menu");
            System.out.println("Enter your choice: ");
            int choice = new java.util.Scanner(System.in).nextInt();
            if (choice == 1) {
                GuessTheNumber guessTheNumber = new GuessTheNumber();
                guessTheNumber.guessTheNumber();
            } else if (choice == 2) {
                RockPaperScissors rockPaperScissors = new RockPaperScissors();
                rockPaperScissors.rockPaperScissors();
            } else if (choice == 3) {
                MainMenu.mainmenu();
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}

package Games;

public class StonePaper {
    public void stonePaper() {
        System.out.println("Welcome to Stone Paper Scissors");
        while (true) {
            System.out.println("How many rounds do you want to play?");
            int rounds = new java.util.Scanner(System.in).nextInt();
            int userScore = 0;
            int computerScore = 0;
            int noOfGames = 0;
            while (true) {
                System.out.println("Enter 1 for Stone, 2 for Paper and 3 for Scissors");
                int computerChoice = new java.util.Random().nextInt(1, 3);
                System.out.println("Enter your choice: ");
                int input = new java.util.Scanner(System.in).nextInt();
                noOfGames++;
                System.out.println("The computer chose " + computerChoice);
                if (input == computerChoice) {
                    System.out.println("It's a tie");
                } else if (input == 1 && computerChoice == 2) {
                    System.out.println("The computer wins");
                    computerScore++;
                } else if (input == 1 && computerChoice == 3) {
                    System.out.println("You win");
                    userScore++;
                } else if (input == 2 && computerChoice == 1) {
                    System.out.println("You win");
                    userScore++;
                } else if (input == 2 && computerChoice == 3) {
                    System.out.println("The computer wins");
                    computerScore++;
                } else if (input == 3 && computerChoice == 1) {
                    System.out.println("The computer wins");
                    computerScore++;
                } else if (input == 3 && computerChoice == 2) {
                    System.out.println("You win");
                    userScore++;
                } else {
                    System.out.println("Invalid input");
                    break;
                }
                System.out.println("Your score is " + userScore);
                System.out.println("The computer's score is " + computerScore);
                System.out.println("The number of games played is " + noOfGames);
                if (rounds == noOfGames) {
                    if (userScore > computerScore) {
                        System.out.println("You win the game");
                    } else if (userScore < computerScore) {
                        System.out.println("The computer wins the game");
                    } else {
                        System.out.println("It's a tie");
                    }
                    break;
                }
            }
            System.out.println("Do you want to play again? (y/n)");
            String playAgain = new java.util.Scanner(System.in).next();
            if (playAgain.equals("n")) {
                break;
            } else if (!playAgain.equals("y")) {
                System.out.println("Invalid input");
                break;
            }
        }
    }
}

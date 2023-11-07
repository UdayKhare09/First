package Games;

import Menus.GamesMenu;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public void guessTheNumber() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100");
        while (true) {
            int randomNumber = rand.nextInt(1, 100);
            int noOfGuesses = 0;
            while (true) {
                int input = scanner.nextInt();
                noOfGuesses++;
                System.out.println("The guess is " + input);
                if (input > randomNumber) {
                    System.out.println("The guess is too high");
                } else if (input < randomNumber) {
                    System.out.println("The guess is too low");
                } else {
                    System.out.println("The guess is correct");
                    System.out.println("You guessed the number in " + noOfGuesses + " guesses");
                    break;
                }
            }
            while (true){
            System.out.println("Do you want to play again? (y/n)");
            String playAgain = new java.util.Scanner(System.in).next();
            if (playAgain.equals("n")) {
                GamesMenu.gamesmenu();
            } else if (playAgain.equals("y")) {
                System.out.println("Guess the number between 1 and 100");
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}}

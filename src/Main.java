public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java CLI");
        while (true) {
            System.out.println("Enter 1 for Calculator, 2 for Stone Paper Scissors and 3 for Guess the Number or 4 to exit");
            int input = new java.util.Scanner(System.in).nextInt();
            switch (input) {
                case 1 -> new Maths.Calculator().calculator();
                case 2 -> new Games.StonePaper().stonePaper();
                case 3 -> new Games.GuessTheNumber().guessTheNumber();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }
        }
    }
}


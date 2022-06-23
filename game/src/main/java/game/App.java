package game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        WordChoser chooser = new WordChoser();
        Game game = new Game(chooser);
        System.out.printf("Welcome! Today the word to guess is: \n%s", game.getWordToGuess());
        do {
       

            System.out.printf("\nEnter one letter to guess  (%s attemprs remaining)", game.getRemainingAttempts());

            Scanner scanner = new Scanner(System.in);
            Character guess = scanner.nextLine().charAt(0);
            boolean result = game.guessLetter(guess);

            if (result) {
                System.out.println("Right!");
            } else {
                System.out.printf("Wrong ..");
            }
        } while (game.getRemainingAttempts()>0);


    }


}

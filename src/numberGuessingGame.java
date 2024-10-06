import java.util.Random;
//Random is imported to generate random number
import java.util.Scanner;
//Scanner is imported so we cna read user input.

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //A new random is created.
        Random random = new Random();

        //A new random is created. The default range is 0-99 by '+1', we make it 1-100.
        int randomNumber = random.nextInt(100) + 1;
//        for debugging purposes
//        System.out.println(randomNumber);

        System.out.println("Please make a guess! (1-100) :)");
        //with the while(true) loop, this loop will keep going until it breaks.
        //In this case the correct number needs to be guessed to break.
        //If this was not used, the game would end after one guess.
        while(true) {
            int playerGuess = scanner.nextInt();

            if (playerGuess == randomNumber) {
                System.out.println("You guessed in right! Congrats!");
                break;
            }
            else if (playerGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("Too low! Try again.");
            }
        }
    }
}

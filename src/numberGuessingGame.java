import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
//        System.out.println(randomNumber);

        System.out.println("Please make a guess! (1-100) :)");
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

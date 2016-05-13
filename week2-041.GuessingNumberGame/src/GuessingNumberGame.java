
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int guesses = 0;
        int number = 0;
        while (true) {
            System.out.print("Guess a number: ");
            number = Integer.parseInt(reader.nextLine());

            if (number == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (number > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + 
                        guesses);
            } else {
                System.out.println("The number is greater, guesses made: " +
                        guesses);
            }
            
            guesses++;
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

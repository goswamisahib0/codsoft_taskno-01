import java.util.Scanner;
import java.util.Random;

public class Number_Game {
    public static void main(String[] args) {
        numbergame();
    }

    public static void numbergame() {
        Scanner scanner = new Scanner(System.in);
        int range, guessedNumber, randomNumber, attempts = 3;
        char choice;

        System.out.println("Welcome To Number Game...!");
        System.out.print("SELECT A RANGE FROM 1 TO ? : ");
        range = scanner.nextInt();

        Random random = new Random();
        randomNumber = random.nextInt(range) + 1;

        do {
            System.out.println("You Have " + attempts + " Attempts to Guess.");
            System.out.print("Guess Your Number: ");
            guessedNumber = scanner.nextInt();

            if (guessedNumber != randomNumber) {
                attempts--;
                System.out.println("Failed! Attempts Left: " + attempts);
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                System.out.print("Do You Want To Play Again? (Y/N): ");
                choice = scanner.next().charAt(0);

                if (choice == 'Y' || choice == 'y') {
                    System.out.println("Game Starting Again...!");
                    numbergame();
                    break;
                } else {
                    System.out.println("Exiting...!");
                    break;
                }
            }
        } while (attempts > 0);

        if (attempts == 0) {
            System.out.println("You have lost the game.");
            System.out.print("Do You Want To Play Again? (Y/N): ");
            choice = scanner.next().charAt(0);

            if (choice == 'Y' || choice == 'y') {
                System.out.println("Game Starting Again...!");
                numbergame();
            } else {
                System.out.println("Exiting...!");
            }
        }
    }
}
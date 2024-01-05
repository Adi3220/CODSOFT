//TASK-1:Number Game
import java.util.*;

public class java1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int least = 1;
        int most = 100;
        int maxAttempts = 20;
        int score = 0;

        System.out.println("Welcome to the Number Game! \nYou will get 20 attempts to guess the number \nAll the Best, guess in less attempts!");

        do {
            int targetNumber = r.nextInt(most - least + 1) + least;
            System.out.println("I have generated a number between " + least + " and " + most + ". Try to guess it!");

            int attempts = 0;
            boolean correct = false;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    correct = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!correct) {
                System.out.println("Sorry! You have reached the maximum number of attempts. The correct number was: " + targetNumber);
            } else {
                score++;
            }

            System.out.print("Do you want to play again? (y/n): ");
        } while (sc.next().equalsIgnoreCase("y"));

        System.out.println("Thank you for playing! Your final score is: " + score);
    }
}

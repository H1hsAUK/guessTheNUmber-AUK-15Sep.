import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(11);
        int triedTimes = 0;
        System.out.println(x); // just to check how it works
        boolean guessed = false;



        while (guessed == false) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");
            int guess = new Scanner(System.in).nextInt();

            triedTimes++;
            if (guess < x) {
            System.out.println("\n Try a bigger number "); }
            else if (guess > x) {
                System.out.println("\nTry a smaller number ");
                }
            else if (guess == x) {
                System.out.println("You guessed!");
                guessed = true;
            }

        }
        System.out.println("Game ended! \n Attempts: " + triedTimes + "\nCorrect answer was:" + x );

    }
}
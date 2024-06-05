import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) ((Math.random() * 100) + 1);
        int guess = -1, cnt = 0;
        while (guess != randomNumber) {
            System.out.println("Guess a number between 1-100");
            guess = sc.nextInt();
            if (guess < randomNumber) {
                System.out.println(guess + " is low ");
            } else if (guess > randomNumber) {
                System.out.println(guess + " is high");
            }
            cnt++;
        }
        System.out.println("You guessed the number " + randomNumber + " with " + cnt + " number of guesses");
        sc.close();
    }
}

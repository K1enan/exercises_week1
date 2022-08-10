package se.lexcion;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guess {

  public static void ex8 () {

        int guess;
        int min = 1;
        int max = 500;
        int random = ThreadLocalRandom.current().nextInt(min, max);

        boolean playing = true;

        while (playing) {

            System.out.println("Enter a number between 1 and 500:");
            Scanner reader = new Scanner(System.in);
            guess = reader.nextInt();

            if (guess < random)
                System.out.println("Your guess was too small\n");

            else if (guess > random)
                System.out.println("Your guess was too big\n");

            else {
                System.out.println("You win");
                playing = false;
            }
        }

    }
}

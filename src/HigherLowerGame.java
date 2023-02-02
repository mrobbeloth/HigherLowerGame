import mcs.mvnu.vestaboard.VestaBoard;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.IOException;
import java.util.Scanner;

public class HigherLowerGame {

    public static void main(String[] args) throws ConfigurationException, IOException, InterruptedException {
        Scanner readMe = new Scanner(System.in);
        VestaBoard vb = new VestaBoard();
        int value = (int) ((Math.random() * 100) % 100 + 1);

        vb.postMessage("Guess (1 - 99): ");
        int guess = Integer.valueOf(readMe.nextLine().trim());
        int tries = 0;
        while(guess != value) {
            if (guess < value) {
                vb.postMessage("Higher than " + guess + "\nGuess (1 - 99): ");
            }
            else {
                vb.postMessage("Lower than " + guess + "\nGuess (1 - 99): ");
            }
            tries++;
            guess = Integer.valueOf(readMe.nextLine().trim());
        }
        vb.postMessage("You got it correct,\n it was " + value
                + "\n It took you " + tries + "\nattempt(s)");
    }
}

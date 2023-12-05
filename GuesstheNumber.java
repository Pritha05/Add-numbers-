import java.util.Random;
import java.util.Scanner;

class Game {
    int number;
    int inputnumber;
    int no_of_guess = 0;

    public void setNO_OF_GUESS(int no_of_guess) {
        this.no_of_guess = no_of_guess;

    }

    public int getNO_OF_GUESS() {
        return no_of_guess;
    }

    Game() {
        Random r = new Random();
        this.number = r.nextInt(100);

    }

    void takeuserinput() {
        System.out.println("Guess the number:");
        Scanner s = new Scanner(System.in);
        inputnumber = s.nextInt();

    }

    boolean isCorrectNumber() {

        no_of_guess++;
        if (number == inputnumber) {
            System.out.format("Yes!!You guess right,It was %d Your attempts are %d attempts", number, no_of_guess);
            return true;

        } else if (inputnumber > number) {
            System.out.println("Too High");

        } else if (inputnumber < number) {
            System.out.println("Too Low");

        }

        return false;

    }
}

public class GuesstheNumber {
    public static void main(String[] args) {
        Game g = new Game();

        boolean boo = false;
        while (!boo) {
            g.takeuserinput();
            boo = g.isCorrectNumber();
            // System.out.println(boo);
        }

    }

}

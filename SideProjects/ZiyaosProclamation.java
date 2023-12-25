import java.util.Scanner;

public class ZiyaosProclamation {

    String[] ziyaosMessage = new String[] {"goof", "yourself", "right", "now!"};

    int attempts = 0;
    int correct = 0;

    int goal;

    String guess;
    int guessNumner = 0;

    Scanner gamble;
    
    public ZiyaosProclamation(int min, int max) {

        gamble = new Scanner(System.in);

        System.out.println("Enter a numner to start your game!");

        while (correct < 4 && attempts <= 20)
        {
            goal = (int) (min + Math.random() * (max - min));
            guess = gamble.next();

            try {
                guessNumner = Integer.parseInt(guess);
            } catch (Exception e) {}

            if (guessNumner == goal) {
                System.out.println(ziyaosMessage[correct]);
                correct++;
            } else System.out.println("gys");
            
            System.out.println(correct + " down");
            System.out.println();
            attempts++;


        }

        if (correct == 4)
            System.out.println("congratulations. You took " + attempts + " attempts. Here's the actual message: " + ziyaosMessage);
        else
            System.out.println("Be better! You took too many guesses! Ziyao's message will not be decoded!");
    }
}

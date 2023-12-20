import java.util.Scanner;


// Math.random() generates random number from range [0, 1)

class Guesser {
    static String goofyguess;
}

public class ZiyaosCrypticMessage {
    public static void main(String[] args) {


        String[] ziyaosMessage = new String[4]; 

        ziyaosMessage[0] = "goofy";
        ziyaosMessage[1] = "yourself";
        ziyaosMessage[2] = "right";
        ziyaosMessage[3] = "now!";
        ziyaosMessage = new String[]{"goofy", "yourself", "right", "now!"};

        Scanner gamble = new Scanner(System.in);
        System.out.println("Enter a numner to start your game!");

        int totalAttempts = 0;

        for (int q = 0; q <= 3; q++) {
            int guessNumner = (int)(2 + Math.random() * 7);

            int x = gamble.nextInt();

            totalAttempts++;

            while (x != guessNumner) {
                System.out.println("Ziyao's message will not be decoded!");
                x = gamble.nextInt();
                totalAttempts++;
            }
            System.out.println(ziyaosMessage[q]);
            // for (int i = 0; i <= 3; i++){
            //     System.out.println(ziyaosMessage[i]);
                
            // }

        }
        System.out.println("congratulations. You took " + totalAttempts + " attempts.");


    }

}

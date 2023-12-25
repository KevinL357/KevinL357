import java.util.Scanner;

public class ClashRoyaleProjectTwo {
    public static void main(String[] args) {

        try (Scanner userElixerInput = new Scanner(System.in)) {
            int elixerTotal = 0;
            for (int i = 1; i < 9; i++) {
                System.out.println("Input elixer value for " + i + " card");
                elixerTotal = elixerTotal + userElixerInput.nextInt();
            }
            System.out.println(elixerTotal/8.0);
        }

        return;
    }
}
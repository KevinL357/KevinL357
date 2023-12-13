import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {

        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Most Meta Deck: ");
            String lebter = input.nextLine();

            switch (lebter) { 
                case "gobgiant sparky": //if the input is gobgiant sparky
                    System.out.println("WRONG"); //then terminal will reply with "wrong" and the code will stop
                    break; //code stops
                case "speedy balloon archetype":
                    System.out.println("correct");
                    break;
                case "megaknight 2.0 cycle":
                    System.out.println("Oooh, so close!");
                    break;
                case "miner poison 3.0 cycle":
                    System.out.println("stop!");
                    break;
                default:
                    System.out.println("this deck doesn't exist (trust)");
                    break;
            }
        }

    }
        

}

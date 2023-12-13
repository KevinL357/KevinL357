import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int maximumnumner = 2147483647;
        int minimumnumner = -2147483648;
        int randomnumner = (int)Math.floor(Math.random() *(maximumnumner - minimumnumner + 1) + minimumnumner); //gets range of numners
        try (Scanner intfinder = new Scanner (System.in)) { //what does try mean
            int value = 0;   
            do {
                System.out.println("Enter a number");
                value = intfinder.nextInt();
                if (value != randomnumner){
                    System.out.println("wrong");
                }
                else {
                    break;
                }
            }
            while(true);

            if (value == randomnumner){
                System.out.println("ur not goofy");
            }
        }
    
    } 
}

        
/*        int value = intfinder.nextInt();

        while (value != 5) {
            System.out.println("wrong");
            value = intfinder.nextInt();
        } */
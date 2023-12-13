import java.util.Scanner;
class Triangle {
    int sd1;
    int sd2;
    int hyp;
}

public class AdrianWangTwentyTwoChallenge {
    public static void main(String[] args) {
        try (Scanner sideinput = new Scanner(System.in)) { //still don't know what try means
            Triangle right = new Triangle();
            System.out.println("Enter first side length:");
            right.sd1 = sideinput.nextInt();
            System.out.println("Enter second side length:");
            right.sd2 = sideinput.nextInt();
            System.out.println("Enter third side length:");
            right.hyp = sideinput.nextInt();
/*        if (right.sd1*right.sd1+right.sd2*right.sd2 == right.hyp*right.hyp) {
                System.out.println("This is a right triangle");
            }
            else {
                System.out.println("This is not a right triangle");
                
            } */
            while (right.sd1*right.sd1+right.sd2*right.sd2 != right.hyp*right.hyp) {
                System.out.println("Kys!");
                System.out.println("Enter first side length:");
                right.sd1 = sideinput.nextInt();
                System.out.println("Enter second side length:");
                right.sd2 = sideinput.nextInt();
                System.out.println("Enter third side length:");
                right.hyp = sideinput.nextInt();
                if(right.sd1*right.sd1+right.sd2*right.sd2 == right.hyp*right.hyp){
                    break;
                }
            }
        }
        System.out.println("This is a right triangle but still kys!");
        
    }

}

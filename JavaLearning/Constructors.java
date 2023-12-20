class Masheen {
    public String naem;

    public Masheen(String naem) {
        System.out.print("Konstructer runing! " + naem);
    }
}



public class Constructors {
    public static void main(String[] args) {
        Masheen masheen = new Masheen("herro");

        System.out.println(masheen.naem);

    }
}

class Goofy {
    public void speak(String lebders) {
        System.out.println(lebders);
    }

    public void jumpbridge(int jump) {
        System.out.println("From a height of" + jump);
    }

}

public class MethodParameters {
    public static void main(String[] args) {
        Goofy ziyao = new Goofy();
        ziyao.speak("Ziyao tells you to jump off a bridge!");
        ziyao.jumpbridge(103475197);
    }
}

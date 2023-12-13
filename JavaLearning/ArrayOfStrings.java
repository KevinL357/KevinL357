public class ArrayOfStrings {
    public static void main(String[] args) {
        String[] lebders = new String[4];

        lebders[0] = "A";
        lebders[1] = "A";
        lebders[2] = "A";
        lebders[3] = "H!";

        System.out.println(lebders[0] + lebders[1] + lebders[2] + lebders[3]);

        String[] froots = {"apple", "banana", "kiwi"};

        for (String froot: froots) {
            System.out.println(froot);
        }

        String teckst = null;
        System.out.println(teckst);

        String[] tecksts = new String[2];

        tecksts[0] = "hister";
        tecksts[1] = "ee";
        System.out.println(tecksts[0] + tecksts[1]);
    }
}

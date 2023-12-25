class Thing {
    public final static int LUCKY_NUMBER = 7;
    public String name;
    public static String description;
    public static int count = 0;
    public int id;
    public Thing() {
        id = count;
        count++;
    }
    public void showName() {
        System.out.println("object id: " + id + ", " + description + ": " +name);
    }
    public static void showInfo() {
        System.out.println(description);
    }
}
public class StaticAndFinal {
    public static void main(String[] args) {
        Thing.description = "Now I am become Death, the destroyer of worlds";
        System.out.println(Thing.description);
        Thing.showInfo();
        System.out.println("Before creating objects, count is equal to: " + Thing.count);
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        System.out.println("After creating objects, count is equal to: " + Thing.count);
        thing1.name = "darius";
        thing2.name = "phosphate";
        thing1.showName();
        thing2.showName();
        System.out.println(Thing.LUCKY_NUMBER);
    }
}

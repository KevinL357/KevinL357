class Machine {
    public String name;
    private int code;

    public Machine() {
        System.out.print("First constructor works");
        name = "arnold";
    }

    public Machine(String name){
        System.out.println("Second constructor works");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third constructor works");
        this.name = name;
        this.code = code;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Machine machine = new Machine();

        Machine machine2 = new Machine("Bert");

        Machine machine3 = new Machine("Samuel", 3);

    }
}

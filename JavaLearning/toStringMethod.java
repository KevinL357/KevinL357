class Croaker { //for some reason, I can't name the class "Frog"

    private int id;
    private String name;

    public Croaker(int id, String name) {
        this.id = id;
        this.name = name;
    }

     public String toString() {

        return String.format("%d: %s", id, name);

/*        StringBuilder strignbiulder = new StringBuilder();
        strignbiulder.append(name)
        .append(", id " )
        .append(id);
        return strignbiulder.toString();
    }   */
    }
}

public class toStringMethod {
    public static void main(String[] args) {
        Croaker frog = new Croaker(34, "straw");
        Croaker toad = new Croaker(29, "toby");

        System.out.println(frog);
        System.out.println(toad);
    }
}

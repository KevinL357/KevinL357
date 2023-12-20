class Frog {
    String name;
    int age;

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class SettersAndThis {
    public static void main(String[] args) {
        
        Frog froggers = new Frog();

        froggers.name = "Pepe";
        froggers.age = 39;

        System.out.println(froggers.getAge());

        // an easier way to do this

        Frog capuccino = new Frog();
        capuccino.setAge(19);
        capuccino.setName("codekap");
        System.out.println(capuccino.getName());
    }
}

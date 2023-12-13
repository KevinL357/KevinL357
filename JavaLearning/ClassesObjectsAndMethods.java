class Persen { //classes can hold data (instance variables), methods
    String name;
    int age; //allows for person to have two categories: name and age

    void speek() { //creation of method, if you want to use it, you must call it, any code you like (i think)
        for (int i = 0; i < 1958; i++) {
            System.out.println("Fortnite Batlle Passer");
        }
        System.out.println("missie, " + name + ", " + age);
    }
}
public class ClassesObjectsAndMethods {
    public static void main(String[] args) { //public classes must match name of the file
        Persen John = new Persen();
        John.name = "Billy";
        John.age = 39548;
        John.speek(); //this is how to call a method

        Persen Broster = new Persen();
        Broster.name = "Jester";
        Broster.age = 2553;
        Broster.speek();
    }
}
//Interfaces: They are goofy little things that contain methods with no code for the methods

public class Interfaces {
    public static void main(String[] args) {
        
        InterfacesMachine mk1 = new InterfacesMachine();
        mk1.start();
        InterfacesPerson person1 = new InterfacesPerson("Barry");
        person1.speak();

        InterfacesInfo info1 = new InterfacesMachine();
        info1.showInfo();        
        InterfacesInfo info2 = person1;
        info2.showInfo();

        System.out.println();

        outputInfo(mk1);
        outputInfo(person1);

    }

    private static void outputInfo(InterfacesInfo info) {
        info.showInfo();
    }
}

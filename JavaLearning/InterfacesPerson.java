public class InterfacesPerson implements InterfacesInfo{
    private String name;
    
    public InterfacesPerson(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Speech Impediment");
    }

    public void showInfo() {
        System.out.println("Person's name is: " + name);
    }
}

public class InterfacesMachine implements InterfacesInfo {

    private int id = 7;
    
    public void start() {
        System.out.println("Machine startering!");
    }

    public void showInfo() {
        System.out.println("Maching ID is: " + id);
    }
}

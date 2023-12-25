import javax.swing.event.SwingPropertyChangeSupport;

public class InheritanceCar extends InheritanceMachine {

    public void beautifulChaos() {
        System.out.println("The clouds danced in harmonious chaos while the stars whispered secrets to the ocean waves.");
    }

    @Override //@Override checks to make sure that "start" is actually in the parent class and isn't just creating a new method
    public void start() {
        System.out.println("Car starteringdederist!");
    }

    @Override
    public void stop() {
        System.out.println("Car stopperingdederist!");
    }
}

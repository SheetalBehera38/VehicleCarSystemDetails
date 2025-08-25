package vehicledata;
import java.util.*;

/**
 * Car class extends Vehicle, adding gear and transmission details.
 */
public class Car extends Vehicle {
    private boolean isManual;
    private int gears;
    private int currentGear;

    public Car(String name, int wheels, boolean isManual, int gears) {
        super(name, wheels);
        this.isManual = isManual;
        this.gears = gears;
        this.currentGear = 1;
    }

    public void changeGear(int newGear) {
        if (newGear > 0 && newGear <= gears) {
            this.currentGear = newGear;
            System.out.println(getName() + " changed to gear " + currentGear);
        } else {
            System.out.println("Invalid gear selection!");
        }
    }

    public void accelerate(int speed, int direction) {
        System.out.println(getName() + " is accelerating...");
        move(speed, direction);
    }
}
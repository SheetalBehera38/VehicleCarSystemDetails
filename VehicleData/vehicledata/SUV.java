package vehicledata;
import java.util.*;

/**
 * SUV class extends Car, adding off-road features.
 */
public class SUV extends Car {

    public SUV(String name, boolean isManual) {
        super(name, 4, isManual, 6); // Default: 4 wheels, 6 gears
    }

    public void activate4x4() {
        System.out.println(getName() + " 4x4 mode activated!");
    }
}
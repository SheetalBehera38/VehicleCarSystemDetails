package vehicledata;
import java.util.*;

/**
 * Main class to test the Vehicle, Car, and SUV functionality.
 */
public class VehicleMain {
    public static void main(String[] args) {
        // Create SUV object
        SUV fortuner = new SUV("Toyota Fortuner", false);

        // Demonstrate functionality
        fortuner.move(40, 0);          // from Vehicle
        fortuner.changeGear(3);        // from Car
        fortuner.accelerate(80, 1);    // from Car
        fortuner.activate4x4();        // from SUV
        fortuner.stop();               // from Vehicle
    }
}
package vehicledata;

import java.util.*;

/**
 * Base class representing a generic Vehicle.
 */
public class Vehicle {
    private String name;
    private int wheels;

    public Vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public void move(int speed, int direction) {
        System.out.println(name + " is moving at " + speed + " km/h in direction " + direction);
    }

    public void stop() {
        System.out.println(name + " has stopped.");
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }
}
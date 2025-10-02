package Flight;

import java.util.ArrayList;

/**
 * Class: ThingsThatMove
 * Name: Muhammad Qureshi
 * Course: ITEC section 5 Fall 2025
 * Written: October 1, 2025
 *
 * Application that demonstrates movement of objects.
 */
public class ThingsThatMove {
    public static void main(String[] args) {
        ArrayList<Movement> movingObjects = new ArrayList<>();

        movingObjects.add(new Airplane("Boeing 747", 2016));
        movingObjects.add(new Bird("Eagle"));
        movingObjects.add(new Bird("Hummingbird"));

        for (Movement obj : movingObjects) {
            System.out.println(obj.toString() + ":");
            obj.fly();
            obj.walk();
            obj.jump();
        }
    }
}

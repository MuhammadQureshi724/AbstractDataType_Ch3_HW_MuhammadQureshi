package Flight;

import java.util.ArrayList;

/**
 * Class: ThingsThatFly
 *Name: Muhammad Qureshi
 * Course: ITEC section 5 Fall 2025
 * Written: October 1, 2025
 *
 * Application that demonstrates flying objects.
 */
public class ThingsThatFly {
    public static void main(String[] args) {
        ArrayList<Flight> flyingObjects = new ArrayList<>();

        flyingObjects.add(new Airplane("Boeing 747", 2016));
        flyingObjects.add(new Bird("Eagle"));
        flyingObjects.add(new Bird("Hummingbird"));

        for (Flight obj : flyingObjects) {
            System.out.print(obj.toString() + ": ");
            obj.fly();
        }
    }
}

package Flight;

/**
 * Interface: Movement
 * @author Muhammad Qureshi
 * @version 1.0
 * Course: ITEC XXXX Fall 2025
 * Written: October 1, 2025
 *
 * Movement interface extending Flight.
 * Defines walking and jumping behaviors.
 */
public interface Movement extends Flight {
    void walk();
    void jump();
}

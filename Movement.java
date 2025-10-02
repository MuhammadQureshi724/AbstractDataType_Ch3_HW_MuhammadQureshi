package Flight;

/**
 * Interface: Movement
 Name: Muhammad Qureshi
 * Course: ITEC section 5 Fall 2025
 * Written: October 1, 2025
 *
 * Movement interface extending Flight.
 * Defines walking and jumping behaviors.
 */
public interface Movement extends Flight {
    void walk();
    void jump();
}

package Flight;

/**
 * Class: Bird
 * Name: Muhammad Qureshi
 * Course: ITEC section 5 Fall 2025
 * Written: October 1, 2025
 *
 * Represents a Bird that moves by flapping wings, walking, and jumping.
 */
public class Bird implements Movement {
    private String type;

    public Bird(String type) {
        this.type = type;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public void fly() {
        System.out.println("I flap my wings to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }

    @Override
    public String toString() {
        return "Bird [type=" + type + "]";
    }
}

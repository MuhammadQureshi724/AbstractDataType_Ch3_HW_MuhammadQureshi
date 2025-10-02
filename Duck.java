package MyFarm;

/**
 * Class: Duck
 *Name: Muhammad Qureshi
 *  3.9.1. Exercise 1
 * Course: ITEC Section 5 Fall 2025
 * Written: Written: 29 September , 2025
 *
 * Represents a Duck, subclass of FarmAnimal.
 */
public class Duck extends FarmAnimal {
    private String sound;

    public Duck(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    
    
    }

    public String getSound() { return sound; }
    public void setSound(String sound) { this.sound = sound; }

    @Override
    public String toString() {
        return "Duck " + sound + " " + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 8am-12pm-6pm";
    }
}

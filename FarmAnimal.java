package MyFarm;

/** 
 * Class: FarmAnimal
 * Name: Muhammad Qureshi
 *  3.9.1. Exercise 1
 * Course: ITEC Section 5 Fall 2025
 * Written: Written: 29 September , 2025
 *
 * Abstract class representing a farm animal with basic attributes.
 */
public abstract class FarmAnimal {
    private String name;
    private String gender;
    private double weight;
    private int age;

    /**
     * Constructor for FarmAnimal
     * name animal's name
     * gender animal's gender
     * weight animal's weight
     * age animal's age
     */
    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "[name=" + name + ", gender=" + gender + ", weight=" + weight + ", age=" + age + "]";
    }

    /**
     * Abstract method: feeding schedule
     * return string of feeding times
     */
    public abstract String feedLoadingSchedule();
}

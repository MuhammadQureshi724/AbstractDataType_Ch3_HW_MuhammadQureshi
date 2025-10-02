package Flight;

/**
 * Class: Airplane
 * @author Muhammad Qureshi
 * @version 1.0
 * Course: ITEC XXXX Fall 2025
 * Written: October 1, 2025
 *
 * Represents an Airplane that moves by flying with an engine.
 */
public class Airplane implements Movement {
    private String model;
    private int yearBuilt;

    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYearBuilt() { return yearBuilt; }
    public void setYearBuilt(int yearBuilt) { this.yearBuilt = yearBuilt; }

    @Override
    public void fly() {
        System.out.println("I rely on my engine to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I tax on my wheels.");
    }

    @Override
    public void jump() {
        System.out.println("I cannot jump.");
    }

    @Override
    public String toString() {
        return "Airplane [model=" + model + ", year=" + yearBuilt + "]";
    }
}

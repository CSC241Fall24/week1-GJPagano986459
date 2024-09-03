/*
 * Name: Greg Pagano
 * Date: 2/9/2024
 * Course: CSC241
 * Dr. Chen
 * Assignment: Pokemon Bulbasaur to Venusaur
 * Description: This program defines a Bulbasaur class with methods to set and get its level, ID, name, and to copy itself.
 */

public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        // TODO: Initialize id and level with appropriate values
        this.id = 1;
        this.level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        // TODO: Implement this method
        // Update the level
        this.level = lv;
        if (lv >= 32) {
            this.id = 3;
        } // If the new level is 16 or higher but less than 32, evolve to Ivysaur
        else if (lv >=16){
            this.id = 2;
        }else {
            this.id = 1;// If the new level is 32 or higher, evolve to Venusaur
    }

    // getLevel method
    public int getLevel() {
        // TODO: Implement this method
        return this.level; // Placeholder return value
    }

    // getName method
    public String getName() {
        // TODO: Implement this method
        if (this.id == 1) {
            return "Bulbasaur";
        }
        else if (this.id == 2) {
            return "Ivysaur";
        }
        else{
            return "Venusaur";
        }
        // Return the name based on the current id
        // Placeholder return value
    }

    // getID method
    public int getID() {
        // TODO: Implement this method

        return this.id; // Placeholder return value
    }

    // toString method
    @Override
    public String toString() {
        // TODO: Implement this method

        // Return a string representation of the Bulbasaur object
        return "Level: " + level + ", ID: " + id;; // Placeholder return value
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        // TODO: Implement this method
        if (obj instanceof Bulbasaur) {
            Bulbasaur other = (Bulbasaur) obj;
            return this.id == other.id && this.level == other.level;
        }
        // Compare this Bulbasaur object with another object
        return false; // Placeholder return value
    }

    // copy method
    public Bulbasaur copy() {
        // TODO: Implement this method
        Bulbasaur copy = new Bulbasaur();
        copy.id = this.id;
        copy.level = this.level;
        // Create and return a new Bulbasaur object with the same id and level
        return copy; // Placeholder return value
    }
}

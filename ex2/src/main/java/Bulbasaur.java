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
        this.id = 1;
        this.level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        this.level = lv;
        if (lv >= 32) {
            this.id = 3;
        } else if (lv >= 16) {
            this.id = 2;
        } else {
            this.id = 1;
        }
    }

    // getLevel method
    public int getLevel() {
        return this.level;
    }

    // getName method
    public String getName() {
        if (this.id == 1) {
            return "Bulbasaur";
        } else if (this.id == 2) {
            return "Ivysaur";
        } else {
            return "Venusaur";
        }
    }

    // getID method
    public int getID() {
        return this.id;
    }

    // toString method
    @Override
    public String toString() {
        return "Level: " + level + ", ID: " + id;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Bulbasaur)) return false;
        Bulbasaur other = (Bulbasaur) obj;
        return this.id == other.id && this.level == other.level;
    }

    // copy method
    public Bulbasaur copy() {
        Bulbasaur copy = new Bulbasaur();
        copy.id = this.id;
        copy.level = this.level;
        return copy;
    }
}
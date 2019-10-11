package by.epam.jb29.task12;

import java.util.Objects;

public class MiniCars extends Cars{
    public int weight;
    public int year;

    public MiniCars(String type, int year, String marka, int speed, int weight) throws Exception {
        super(type, year, marka, speed);
        this.weight = weight;
        this.year = year;
    }

    public MiniCars(String marka, int speed, int weight) {
        super(marka, speed);
        this.weight = weight;
    }

    public MiniCars() {
    }

    @Override
    public String toString() {
        return "MiniCars{" +
                "type='" + getType() + '\'' +
                ", weight=" + weight + '\'' +
                ", marka='" + marka + '\'' +
                ", speed=" + speed +
                ", year=" + this.year +
                '}';
    }
}

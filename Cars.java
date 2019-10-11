package by.epam.jb29.task12;

import java.util.Objects;

public class Cars extends Transport {
    public String marka;
    public int speed;

    public Cars(String type, int year, String marka, int speed) throws Exception {
        super(type, year);
        if (speed < 0) {
            throw new Exception("Скорость не может быть отрицательным значением!");
        }

        this.marka = marka;
        this.speed = speed;
    }

    public Cars(String marka, int speed) {
        this.marka = marka;
        this.speed = speed;
    }

    public Cars() {
    }

    @Override
    public void sound() {
        System.out.println("\nжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжж");
    }

    @Override
    public String toString() {
        return "Cars{" +
                "type='" + getType() + '\'' +
                ", marka='" + marka + '\'' +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}


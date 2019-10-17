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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cars)) return false;
        if (!super.equals(o)) return false;
        Cars cars = (Cars) o;
        return speed == cars.speed &&
                Objects.equals(marka, cars.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), marka, speed);
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


package by.epam.jb29.task12;

public class Ships extends Transport{

    public String marka;
    public int speed;

    public Ships(String type, int year, String marka, int speed) throws Exception {
        super(type, year);
        this.marka = marka;
        this.speed = speed;
    }

    @Override

    public String toString() {
        return "Ships{" +
                "type='" + getType() + '\'' +
                ", marka='" + marka + '\'' +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }

    @Override
    public void sound() {
        System.out.println("\nбуль-буль");
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ships)) return false;
        if (!super.equals(o)) return false;
        Ships ships = (Ships) o;
        return speed == ships.speed &&
                Objects.equals(marka, ships.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), marka, speed);
    }
}

package by.epam.jb29.task12;

import java.util.Comparator;
import java.util.Objects;

public abstract class Transport {
    private String type;
    public int year;

    public Transport(String type, int year) throws Exception {
        if (year < 0) {
            throw new Exception("Год не может быть отрицательным значением!");
        }
        this.type = type;
        this.year = year;
    }

    public Transport() {

    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }


    public abstract void sound();

    public static Comparator<Transport> sort = new Comparator<Transport>() {

        public int compare(Transport s1, Transport s2) {
            String name1 = s1.getType().toUpperCase();
            String name2 = s2.getType().toUpperCase();

            return name1.compareTo(name2);
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return year == transport.year &&
                getType().equals(transport.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), year);
    }
}


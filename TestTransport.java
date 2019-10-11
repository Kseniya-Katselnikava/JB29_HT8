package by.epam.jb29.task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TestTransport {

    public static void main(String[] args) throws Exception {

        Transport tr;
        ArrayList<Transport> trans = new ArrayList<Transport>();

        Cars car = new Cars("сухопутный", 1970, "жигули", 90);
        Cars car1 = new Cars("наземный", 1980, "волга", 90);
        Cars car2 = new Cars("наземный", 1980, "жигули", 100);
//        Cars car3 = car2;
        Cars car3 = new Cars("наземный", 1970, "жигули", 90);

        trans.add(car);
        trans.add(car1);
        trans.add(car2);
        trans.add(car3);

        trans.add(new MiniCars("наземный", 2015, "скутер", 100, 100));
        trans.add(new MiniCars("наземный", 2008, "скутер1", 90, 70));
        trans.add(new MiniCars("наземный", 2008, "скутер2", 100, 70));
        trans.add(new MiniCars("наземный", 2015, "скутер3", 100, 100));
        trans.add(new Cars("наземный", 1970, "волга", 180));
        trans.add(new Ships("водный", 2015, "яхта", 200));
        trans.add(new Ships("водный", 2000, "катер", 250));
        MiniCars min = new MiniCars("наземный", 2019, "скутерABC", 200, 100);
        MiniCars min1 = min;

        trans.add(min);
        trans.add(min1);

        Collections.sort(trans, Transport.sort);
        show(trans);
    }


    public static void show(ArrayList arr) {
            for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}

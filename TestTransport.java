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
        Cars car2 = new Cars("наземный", 2000, "жигули", 100);
        Cars car3 = car2;

        trans.add(car);
        trans.add(car1);
        trans.add(car2);
        trans.add(car3);

        trans.add(new MiniCars("наземный", 2015, "скутер", 100, 100));
        trans.add(new MiniCars("наземный", 2010, "скутер", 100, 100));
        trans.add(new MiniCars("наземный", 1999, "скутер1", 90, 70));
        trans.add(new MiniCars("наземный", 2008, "скутер2", 100, 70));
        trans.add(new MiniCars("наземный", 2015, "скутер3", 100, 100));
        trans.add(new Cars("наземный", 1970, "волга", 180));
        trans.add(new Ships("водный", 2015, "яхта", 200));
        trans.add(new Ships("водный", 2000, "катер", 250));
        MiniCars min = new MiniCars("наземный", 2019, "скутерABC", 200, 100);
        MiniCars min1 = min;
        trans.add(min);
        trans.add(min1);

        Ships ship1 = new Ships("водный", 2000, "катер", 250);
        Ships ship2 = ship1;
        trans.add(ship1);
        trans.add(ship2);

        Collections.sort(trans, Transport.sort);
        show(trans);
        System.out.println();

        System.out.println("Узнаем, есть ли в списке объект, на который ссылается еще один объект.");
        ArrayList<Transport> trans1 = equalsObj(trans);
        show(trans1);

        System.out.println("\nУзнаем, есть ли в списке объект, год которого больше заданного.");
        ArrayList<Transport> trans2 = speed(trans);
        show(trans2);

        System.out.println("\nУзнаем, есть ли в списке одинаковые объекты.");
        ArrayList<Transport> trans3 = equalsObj1(trans);
        show(trans3);

    }

// Узнаем, есть ли в списке объект, на который ссылается еще один объект.
    public static ArrayList <Transport> equalsObj (ArrayList <Transport> tr) {
        ArrayList <Transport> comp = new ArrayList <Transport>();
        for (int i = 0; i < tr.size() - 1; i++) {
            for (int j = i + 1; j < tr.size(); j++) {
                if (tr.get(i) == tr.get(j)) {
                    comp.add(tr.get(i));
                    }
                }
            }
        return comp;
    }

    // Узнаем, есть ли в списке одинаковые объекты
    public static ArrayList <Transport> equalsObj1 (ArrayList <Transport> tr) {
        ArrayList <Transport> comp = new ArrayList <Transport>();
        for (int i = 0; i < tr.size() - 1; i++) {
            for (int j = i + 1; j < tr.size(); j++) {
                if (tr.get(i).equals(tr.get(j))) {
                    comp.add(tr.get(i));
                }
            }
        }
        return comp;
    }

    // Узнаем, есть ли в списке объект, год которого больше заданного.
    public static ArrayList <Transport> speed (ArrayList <Transport> tr) {
        ArrayList <Transport> comp = new ArrayList <Transport>();
        for (int i = 0; i < tr.size(); i++) {
                if (tr.get(i).year > 2000 ) {
                    comp.add(tr.get(i));
                }
            }

        return comp;
    }

    public static void show(ArrayList arr) {
            for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}

package gyarab.prg.e1.skupina2;

import java.util.ArrayList;

public class Penal {
    public static void main(String[] args) {
        // arr ArrayList add new
        ArrayList<Pastelka> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Pastelka p = new Pastelka("cervena", i);
            arr.add(p);
        }

        for (int i = 0; i < arr.size(); i++) {
            Pastelka p = arr.get(i);
            System.out.println(p.barva);
        }



    }
}

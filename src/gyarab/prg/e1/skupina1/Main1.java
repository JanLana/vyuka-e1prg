package gyarab.prg.e1.skupina1;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Jablko> arr = new ArrayList<Jablko>();

        for (int i = 0; i < 10; i++) {
            Jablko j = new Jablko(i);
            arr.add(j);
        }
        //....
        for (int i = 0; i < 10; i++) {
            Jablko j = arr.get(i);
            arr.add(j);
        }
    }
}

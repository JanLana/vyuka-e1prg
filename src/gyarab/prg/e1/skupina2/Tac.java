package gyarab.prg.e1.skupina2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String[] arr = new String[10];
        ArrayList arr = new ArrayList();
        int i;


        for (i = 0; ; i++) {
            // FIXME: tohle nemusi dopadnout dobre ...
            String radka = sc.next();

            if (radka.equals("KONEC")) { /* radka.length() == 0,   radka.isEmpty() */
                break;
            }
            arr.add(radka);
        }

        for (int r = arr.size()-1; r >= 0 ; r--) {
            System.out.println(arr.get(r));
        }
    }
}

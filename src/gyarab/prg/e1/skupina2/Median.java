package gyarab.prg.e1.skupina2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        HashMap arr = new HashMap();
        Scanner sc = new Scanner(System.in);

        for(;;) {
            String jmeno = sc.next();
            String prijmeni = sc.next();

            if (jmeno.equals("0") && prijmeni.equals("0")) {
                break;
            }

            if (arr.containsKey(jmeno)) {
                ArrayList<String> seznam2 = (ArrayList<String>)arr.get(jmeno);

            } else {
                ArrayList<String> seznam = new ArrayList<>();
                seznam.add(prijmeni);
                arr.put(jmeno, seznam);
            }
        }
        System.out.println(arr);
        System.out.println(arr.get("Jan"));
    }
}

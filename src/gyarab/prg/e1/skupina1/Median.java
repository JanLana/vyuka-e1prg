package gyarab.prg.e1.skupina1;

import java.util.*;

public class Median {
    public static void main(String[] args) {
        HashMap arr = new HashMap();
        Scanner sc = new Scanner(System.in);

        for (;;) {
            String jmeno = sc.next();
            String prijmeni = sc.next();

            if (jmeno.equals("0") && prijmeni.equals("0")) {
                break;
            }
            if (arr.containsKey(jmeno)) {
                //ArrayList seznam = arr.get(jmeno);
                //seznam.add(prijmeni);

            } else {
                ArrayList<String> seznam = new ArrayList<>();
                seznam.add(prijmeni);
                arr.put(jmeno, seznam);
            }
        }

        System.out.println(arr);
    }
}

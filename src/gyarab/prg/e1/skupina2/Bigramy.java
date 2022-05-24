package gyarab.prg.e1.skupina2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Bigramy {
    public static void main(String[] args) throws IOException {
        //HashSet<String> hledany = new HashSet<>();
        HashMap<String,Integer> tabulkaSlov = new HashMap<>();

        File file = new File("z:/complet.txt"); // napr. soubor.txt
        FileReader reader = new FileReader(file, StandardCharsets.UTF_8);

        char predchozi = ' ';
        for (;;) {
            int z = reader.read();
            if (z == -1)
                break;

            char ch = (char) z;
            String dvojice = predchozi + "-" + ch;
            predchozi = ch;

            if (tabulkaSlov.containsKey(dvojice) == false) {
                tabulkaSlov.put(dvojice, 1);
            } else {
                // nasel jsem slovo ktere v tabulce uz je
                int x = tabulkaSlov.get(dvojice);
                x = x + 1;
                tabulkaSlov.put(dvojice, x);
            }

            //System.out.println(dvojice);
            //hledany.add(dvojice);
        }

        for(String s: tabulkaSlov.keySet()) {
            if (s.charAt(2) == 'a')
                System.out.println(s + " = " + tabulkaSlov.get(s));
        }

    }
}

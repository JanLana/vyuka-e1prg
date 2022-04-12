package gyarab.prg.e1.skupina1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PocetSlov {
    public static void main(String[] args) throws IOException {
        HashSet hledam = new HashSet();

        File file = new File("z:/complet.txt"); // napr. soubor.txt
        FileReader reader = new FileReader(file, StandardCharsets.UTF_8);
        Scanner sc = new Scanner(reader);
        while(sc.hasNext()) {
            String s = sc.nextLine().toLowerCase();
            String[] slova = s.split("[ :.,„!“–;()?‚‘-…»«<>’//]+");

            for (String slovo: slova) {
                // pokud slovo v poli vsechnaSlova neni, pridej ho tam...
                if (! hledam.contains(slovo)) {
                    hledam.add(slovo);
                }
            }
        }

        // zjisti pro kazde slovo, kolikrat je v souboru
        for(Object s: hledam) {
            String sl = (String)s;
            if (sl.length() == 1)
                System.out.println(s);
        }

        System.out.println(hledam.size());
    }
}

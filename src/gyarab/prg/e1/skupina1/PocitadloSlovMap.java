package gyarab.prg.e1.skupina1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;

public class PocitadloSlovMap {
    public static void main(String[] args) throws IOException {
        //HashMap<String,Integer> arr = new HashMap<String, Integer>();
        HashMap<String,Integer> arr = new HashMap<>();

        File file = new File("z:/complet.txt"); // napr. soubor.txt

        FileReader reader = new FileReader(file, StandardCharsets.UTF_8);

        Scanner sc = new Scanner(reader);

        while(sc.hasNext()) {
            String s = sc.nextLine().toLowerCase();
            String[] slova = s.split("[ :.,„!“–;()?‚‘-…»«<>’//]+");

            for (String slovo : slova) {
                // pokud slovo v poli vsechnaSlova neni, pridej ho tam...
                if (arr.containsKey(slovo)) {
                    // hledane slovo uz tu bylo...
                    int x = arr.get(slovo);
                    x = x + 1;
                    arr.put(slovo, x);
                } else {
                    arr.put(slovo, 1);
                }
            }
        }
        for(String sloupec1 : arr.keySet()) {
            System.out.println(sloupec1);
        }

    }
}

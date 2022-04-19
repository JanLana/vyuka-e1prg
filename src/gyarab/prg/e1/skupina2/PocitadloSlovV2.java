package gyarab.prg.e1.skupina2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;

public class PocitadloSlovV2 {


    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> tabulkaSlov = new HashMap<>();

        File file = new File("z:/complet.txt"); // napr. soubor.txt
        FileReader reader = new FileReader(file, StandardCharsets.UTF_8);
        Scanner sc = new Scanner(reader);

        while (sc.hasNext()) {
            String line = sc.nextLine().toLowerCase();
            String[] slova = line.split(" ");

            for (String slovo : slova) {
                if (tabulkaSlov.containsKey(slovo) == false) {
                    tabulkaSlov.put(slovo, 1);
                } else {
                    // nasel jsem slovo ktere v tabulce uz je
                    int x = tabulkaSlov.get(slovo);
                    x = x + 1;
                    tabulkaSlov.put(slovo, x);
                }
            }
        }

        for (String k : tabulkaSlov.keySet()) {
            int x = tabulkaSlov.get(k);
            System.out.println(k);
        }
    }
}

package gyarab.prg.e1.skupina2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PocetSlov {

    public static void main(String[] args) throws IOException {
        HashSet<String> hledany = new HashSet<>();

        File file = new File("z:/complet.txt"); // napr. soubor.txt
        FileReader reader = new FileReader(file, StandardCharsets.UTF_8);
        Scanner sc = new Scanner(reader);

        while (sc.hasNext()) {
            String line = sc.nextLine().toLowerCase();
            String[] slova = line.split(" ");

            for(String slovo: slova) {
                // v promene slovo mam vsechna slova z textu
                if (hledany.contains(slovo) == false) {
                    hledany.add(slovo);
                }
            }
        }
        System.out.println(hledany.size());
    }
}

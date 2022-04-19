package gyarab.prg.e1.skupina2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class PocetPismen {
    public static void main(String[] args) throws IOException {
        //ArrayList hledany = new ArrayList();
        ArrayList<PismenkoSPoctem> hledany = new ArrayList<>();

        File file = new File("z:/complet.txt"); // napr. soubor.txt
        FileReader reader = new FileReader(file, StandardCharsets.UTF_8);
        for (; ; ) {
            int z = reader.read();
            if (z == -1)
                break;

            char ch = (char) z;
            ch = Character.toLowerCase(ch);

            // je ch v hleadny? Jestlize jo, ok, a jestlize ne, tak ho vypis
            boolean jeNovy = true;
            for (int k = 0; k < hledany.size(); k++) {
                PismenkoSPoctem polozka = hledany.get(k);
                if (ch == polozka.ch) {
                    polozka.pocet++;
                    jeNovy = false;
                }
            }
            if (jeNovy) {
                PismenkoSPoctem p = new PismenkoSPoctem(ch);
                hledany.add(p);
            }
        }

        for (int i = 0; i < hledany.size(); i++) {
            PismenkoSPoctem polozka = hledany.get(i);
            //System.out.println(polozka.znak + ": " + polozka.pocet);
            //System.out.println(polozka.toString());
            System.out.println(polozka);
        }

        for(PismenkoSPoctem p : hledany) {
            System.out.println(p);
        }


        //System.out.println(hledany.size());
    }

}

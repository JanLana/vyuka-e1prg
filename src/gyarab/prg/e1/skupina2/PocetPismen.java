package gyarab.prg.e1.skupina2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class PocetPismen {
    public static void main(String[] args) throws IOException {
        ArrayList hledany = new ArrayList();
        //char hledany[] = {'a', 'e', 'i', 'g', 'n', 's' , ' ', '\n', 'k'};

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
                if (ch == (char)hledany.get(k)) {
                    jeNovy = false;
                }
            }
            if (jeNovy) {
                System.out.print(ch);
                hledany.add(ch);
            }
        }
        System.out.println(hledany.size());
    }


        /*
        for(int i = 0; i < hledany.length; i++) {
            char hleadnePismenko = hledany[i];


            int pocet = 0;
            for (; ; ) {
                int z = reader.read();
                if (z == -1)
                    break;

                char ch = (char) z;
                ch = Character.toLowerCase(ch);

                if (ch == hleadnePismenko) {
                    pocet++;
                }
            }
            System.out.println(hleadnePismenko+ " " + pocet);
        }

         */

}

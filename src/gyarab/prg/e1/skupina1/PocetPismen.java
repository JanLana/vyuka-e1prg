package gyarab.prg.e1.skupina1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class PocetPismen {
    public static void main(String[] args) throws IOException {
        //char hledam[] = {'a', 'e', 'i', 'o', 'g','n', 's', ' ', '\n'};
        ArrayList hledam = new ArrayList();

        File file = new File("z:/complet.txt"); // napr. soubor.txt
        FileReader reader = new FileReader(file, StandardCharsets.UTF_8);
        Scanner sc = new Scanner(reader);

        char pismeno1 = ' ';
        for (; ; ) {
            int j = reader.read();
            if (j == -1)
                break;

            char pismeno2 = (char) j;
            pismeno2 = Character.toLowerCase(pismeno2);

            System.out.println(pismeno1 + " ");





            /*
            // kdyz pismeno2 neni v hledam, vypis ho a konec
            boolean jeNovy = true;
            for (int k = 0; k < hledam.size(); k++) {
                if (pismeno2 == (char)hledam.get(k)) {
                    jeNovy = false;
                }
            }
            if (jeNovy) {
                System.out.print(pismeno2);
                hledam.add(pismeno2);
            }

             */

        }
    }
}
//kaptoly: čáuříběhzmův.rd,šžc„ťj!“–éýň;ďfx()?‚‘úó-/… »« <>[]




/*
            for (int i = 0; i < hleadam.length; i++) {
            char hledanyZnak = hleadam[i];

            File file = new File("z:/complet.txt"); // napr. soubor.txt
            FileReader reader = new FileReader(file, StandardCharsets.UTF_8);

            int pocet = 0;
            for(;;) {
                int j = reader.read();
                if (j == -1)
                    break;

                char ch = (char) j;
                ch = Character.toLowerCase(ch);

                if (ch == hledanyZnak) {
                    pocet++;
                }
            }
            System.out.println(hledanyZnak + " " + pocet);
        }

    }
}

 */

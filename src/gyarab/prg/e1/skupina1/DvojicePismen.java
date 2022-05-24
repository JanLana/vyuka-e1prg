package gyarab.prg.e1.skupina1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Scanner;

public class DvojicePismen {
    public static void main(String[] args) throws IOException {
        File file = new File("z:/complet.txt"); // napr. soubor.txt
        FileReader reader = new FileReader(file, StandardCharsets.UTF_8);
        HashSet<String> words = new HashSet<>();

        char pismeno1 = ' ';
        for (; ; ) {
            int j = reader.read();
            if (j == -1)
                break;

            char pismeno2 = (char) j;
            String dvojice = pismeno1 + " " + pismeno2;
            pismeno1 = pismeno2;

            words.add(dvojice);
        }

        for (String dvojice: words) {
            if (dvojice.charAt(0) == 'b')
                System.out.println(dvojice);

        }
    }
}


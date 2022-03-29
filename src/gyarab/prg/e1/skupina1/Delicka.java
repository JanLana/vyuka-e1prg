package gyarab.prg.e1.skupina1;

import java.util.ArrayList;
import java.util.Scanner;

public class Delicka {
    public static void main(String[] args) {
        int pocet;

        Scanner sc = new Scanner(System.in);

        ArrayList radky = new ArrayList();

        for(pocet = 0; ;pocet++) {
            String input = sc.nextLine();
            if (input.isEmpty()) {   /* input.equals("") */
                break;
            }
            radky.add(input);
        }

        for (int i = 0; i < pocet; i++) {
            System.out.println(radky.get(i));
        }
    }
}

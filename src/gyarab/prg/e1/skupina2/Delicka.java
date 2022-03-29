package gyarab.prg.e1.skupina2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Delicka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;

        try {
            x = sc.nextInt();
            y = sc.nextInt();
            z = x/y;
            System.out.println(z);
        } catch(InputMismatchException e) {
            System.out.println("vstup neni cislo!");
        } catch(ArithmeticException e) {
            System.out.println("chyba deleni");
        }





    }
}

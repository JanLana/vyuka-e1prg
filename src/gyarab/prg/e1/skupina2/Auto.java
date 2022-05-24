package gyarab.prg.e1.skupina2;

public class Auto {
    private String SPZ;
    private int aktualniRychlost;
    private int MAXIMALNI_RYCHLOST = 250;

    public Auto(String spz) {
        SPZ = spz;
    }

    public void zrychlio10kmh() {
        if (aktualniRychlost + 10 > MAXIMALNI_RYCHLOST) {
            aktualniRychlost = MAXIMALNI_RYCHLOST;
        } else {
            aktualniRychlost += 10;
        }
    }

    public int getAktualniRychlost() {
        return aktualniRychlost;
    }

    public String getSPZ() {
        return SPZ;
    }



    public void zabrzdi() {

    }

}

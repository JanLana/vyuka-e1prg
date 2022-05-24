package gyarab.prg.e1.skupina1;

public class Auto {
    private String SPZ;
    private int aktualniRychlost;
    private int MAXIMALNI_RYCHLOST = 250;

    public Auto() {

    };

    public String dejSPZ() { return SPZ; };

    public void pridejRychlost(int oKolik) {
        if (aktualniRychlost+oKolik > MAXIMALNI_RYCHLOST) {
            aktualniRychlost = MAXIMALNI_RYCHLOST;
        } else {
            aktualniRychlost += oKolik;
        }
    }

    public int getAktualniRychlost() {
        return aktualniRychlost;
    }

    public String getSPZ() {
        return SPZ;
    }



    public void zabrzdi() { };
}

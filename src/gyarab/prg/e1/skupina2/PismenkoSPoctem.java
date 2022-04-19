package gyarab.prg.e1.skupina2;

public class PismenkoSPoctem {
    char ch;
    int pocet;

    public PismenkoSPoctem(char ch) {
        this.ch = ch;
        pocet = 1;
    }

    @Override
    public String toString() {
        return ch + ":" + pocet;
    }
}

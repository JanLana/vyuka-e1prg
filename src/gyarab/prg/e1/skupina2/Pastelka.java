package gyarab.prg.e1.skupina2;

public class Pastelka {
    String barva;
    int tvrdost;

    public Pastelka(String barva, int tvrdost) {
        this.barva = barva;
        this.tvrdost = tvrdost;
    }

    @Override
    public String toString() {
        return "Pastelka{" +
                "barva='" + barva + '\'' +
                ", tvrdost=" + tvrdost +
                '}';
    }
}

package gyarab.prg.e1.skupina2;

public class Ridic {
    private Auto a;
    public Ridic() {
        a = new Auto("ABC1234");
    }

    public void ujed100km() {
        //a.aktualniRychlost = 1000;
        for (int i = 0; i < 100; i++) {
            a.zrychlio10kmh();
            System.out.println("Auto s SPZ " +
                            a.getSPZ() +
                    " jede rychlosti " +
                    //a.aktualniRychlost);
                    a.getAktualniRychlost());
        }
        //sleep("7min");
        //a.aktualniRychlost = -1000/60;
        //sleep("1min");
    }

    public static void main(String[] args) {
        Ridic r = new Ridic();
        r.ujed100km();
    }
}

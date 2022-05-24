package gyarab.prg.e1.skupina1;

public class Ridic {
    private Auto a;

    public Ridic() {
        a = new Auto();
    };

    void dojed100km() {
        a.pridejRychlost(1000);
        System.out.println("Aktualni rychlost:" +
                //a.getaktualniRychlost);
                a.getAktualniRychlost());
        //sleep("6min");
    };

}

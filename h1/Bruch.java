package h1;

public class Bruch {
    int zaehler;
    int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        if (x == 0) return y;
        if (y == 0) return x;
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }

    public void shorten() {
        int g = ggT(zaehler, nenner);
        if (g == 0) return;
        zaehler /= g;
        nenner /= g;
    }

    public boolean hasSameValueAs(Bruch b) {
        if (b == null) return false;
        return this.zaehler * b.nenner == b.zaehler * this.nenner;
    }

    @Override
    public String toString() {
        return zaehler + "/" + nenner;
    }
}

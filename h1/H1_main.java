package h1;

public class H1_main {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(25, 5);
        System.out.println("b1 before shorten: " + b1);
        b1.shorten();
        System.out.println("b1 after shorten: " + b1);

        Bruch b2 = new Bruch(15, 9);
        Bruch b3 = new Bruch(5, 3);
        System.out.println(b2 + " has same value as " + b3 + " ? " + b2.hasSameValueAs(b3));

        Bruch b4 = new Bruch(8, 12);
        System.out.println("b4 before shorten: " + b4);
        b4.shorten();
        System.out.println("b4 after shorten: " + b4);
    }
}

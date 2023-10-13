package Beginner.Vererbung;

public class Vererbung {
    public static void main(String[] args) {
        Tier t = new Tier();
        Hund h = new Hund();
        Tier t2 = new Hund();
        Hund h2 = (Hund)t2;
        System.out.println(t.machDichBemerkbar());
        System.out.println(h.gibRasseZurueck());
        System.out.println(h.machDichBemerkbar());
        System.out.println(t2.machDichBemerkbar());
        System.out.println(h2.gibRasseZurueck());
        System.out.println(h2.machDichBemerkbar());
    }
}

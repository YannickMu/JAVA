package Beginner.Klassen;

public class KonstruktorenKlassen {
    public static void main(String[] args) {
        Vektor v = new Vektor(1);
        Vektor v2 = new Vektor(0,3);
        v.z = 4;
        Vektor v3 = v.add(v2);

        System.out.println(v3);
    }
}

package Beginner.Klassen;

public class Klassen {
    public static void main(String[] args) {
        Vektor v = new Vektor();
        Vektor v2 = new Vektor();

        v.x = 1;
        v.y = 0;
        v.z = 0;

        Vektor v3 = v.add(v2);

        System.out.println(v3);
    }
}


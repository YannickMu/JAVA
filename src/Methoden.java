import java.util.Scanner;

public class Methoden {
    public static void main(String[] args) {
        int Zahl1;
        int Zahl2;

        Scanner Zahl = new Scanner(System.in);
        System.out.println("Gebe Ganzzahl ein.");
        Zahl1 = Zahl.nextInt();

        Zahl = new Scanner(System.in);
        System.out.println("Gebe eien zweite Ganzzahl ein.");
        Zahl2 = Zahl.nextInt();

        int i = plus(Zahl1, Zahl2);
        System.out.println("\nAddition:\n" + i);
        throw new RuntimeException("Gratulation das Programm funktioniert ordnungsgemäss.");
    }

    public static int plus(int a, int b){
        return a + b;
    }
}

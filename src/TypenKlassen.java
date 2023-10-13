public class TypenKlassen {
    public static void main(String[] args){
        //int = 32 BIT = -2'147'483'648, ..., 2'147'483'647
        int intzahl;
        intzahl = 10;
        intzahl += 10 + 5 * 3;
        System.out.println(intzahl);
        //long = 62 BIT = -9'223'372'036'854'775'808, ..., 9'223'372'036'854'775'807
        long longzahl;
        longzahl = 10;
        longzahl += 10 + 5 * 3;
        System.out.println(longzahl);

        double doublezahl;
        doublezahl = 10.345356;
        doublezahl += 10 + 5 * 3;
        System.out.println(doublezahl);

        char buchstabe;
        buchstabe = 'c';
        System.out.println(buchstabe);

        String text;
        text = "Hallo Welt!";
        System.out.println(text);
    }
}

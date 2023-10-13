import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        int inpmonat;

        Scanner Obj = new Scanner(System.in);
        System.out.println("Gebe einen Monat in Zahl ein.");
        inpmonat = Obj.nextInt();

        String monat = switch (inpmonat){
            case 1:
                yield "01 Januar";
            case 2:
                yield "02 Februar";
            case 3:
                yield "03 März";
            case 4:
                yield "04 April";
            case 5:
                yield "05 Mai";
            case 6:
                yield "06 Juni";
            case 7:
                yield "07 Juli";
            case 8:
                yield "08 August";
            case 9:
                yield "09 September";
            case 10:
                yield "10 Oktober";
            case 11:
                yield "11 November";
            case 12:
                yield "12 Dezember";
            default:
                throw new IllegalArgumentException("Der " + inpmonat + ". ist kein Definierter Monat!");
        };
        System.out.println(monat);
    }
}

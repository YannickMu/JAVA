package Beginner.Vererbung;

public class Hund extends Tier{
    String rasse = "Labrador";

    public String gibRasseZurueck(){
        return rasse;
    }
    public String machDichBemerkbar(){
        return "wau";
    }
}

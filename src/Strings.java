public class Strings {
    public static void main(String[] args) {
        String a = "asdf";
        String a2 = "  A      S d     f";
        String a2OhneLeerzeichen = a2.trim();
        String w = new String("wasd");

        if (a.equals(w)){
            System.out.println("Gleich");
        }else {
            System.out.println("Nicht gleich");
        }
        for (int i = 0; i < a.length(); i++){
            System.out.println(i + 1);
        }
        System.out.println(a2.replaceAll("\\s+", "").toLowerCase());

        String text = "Dies ist ein Text in dem ein Suchwort gesucht werden kann.";
        String search = "dem";
        int position = text.indexOf(search);
        System.out.println(position);
    }
}

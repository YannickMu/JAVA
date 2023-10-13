public class If {
    public static void main(String[] args){
        boolean bool;
        bool = false;
        boolean bool2;
        bool2 = true;
        boolean bo;
        bo = bool && bool2;
        if(bool &! bool2){
            System.out.println("Wahr(1)!!");
        } else if (bool2 &! bool) {
            System.out.println("Wahr(2)!!");
        } else if (bo) {
            System.out.println("Wahr(1&2)!!");
        } else {
            System.out.println("Falsch(1&2)!!");
        }
    }
}

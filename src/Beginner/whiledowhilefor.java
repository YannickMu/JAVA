package Beginner;

public class whiledowhilefor {
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        System.out.println("while:");
        //while
        while (i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println("\n\ndo-while:");
        //do-while
        do {
            System.out.println(j);
            j++;
        }while (j <= 10);
        System.out.println("\n\nfor:");
        //for
        for (int k = 0; k <= 10; k++){
            System.out.println(k);
        }
    }
}

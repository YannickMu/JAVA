package Beginner;

public class arrays {
    public static void main(String[] args){
        int[] array = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = i*i;
        }
        for (int j = 0; j < 10; j++){
            System.out.println(array[j]);
        }
    }
}

package uz.practice;

public class ArrayDoubleInt {
    public static void main ( String [] args ) {
        int [] intArr = {1, 2, 3, 4, 5};
        double [] dblArr = {0.5 , 1, 1.5 , 2, 2.5};
        for (int i = 0; i < intArr . length ; i++) {
            dblArr [i] = dblArr [i] * intArr [i];
        }
        for (int i = 0; i < intArr . length ; i++) {
            System .out. println ( intArr [i] + ": " + dblArr [i]);
        }
    }
}
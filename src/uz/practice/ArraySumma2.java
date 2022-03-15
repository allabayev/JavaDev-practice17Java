package uz.practice;

public class ArraySumma2 {
    public static void main ( String [] args ) {
        int [] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < intArr.length; i += 2) {
            System .out. print ( intArr [i] + ", ");
        }
    }
}
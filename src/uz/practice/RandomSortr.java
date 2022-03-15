package uz.practice;

import java.util.Random;
public class RandomSortr {
    public static void main(String[] args) {
        Random rand= new Random();
        int [] myArray=new int[10];
        for (int i=0; i<myArray.length; i++) {
            myArray[i]=rand.nextInt();
        }
        for (int i=0; i<myArray.length; i++) {
            System.out.print(myArray[i]/1000000 + "  ");
        }
        for (int i = 0; i < myArray . length ; i++) {
            int indexOfMin = i;
            for ( int j = i + 1; j < myArray . length ; j++) {
                if ( myArray [j] < myArray [ indexOfMin ]) {
                    indexOfMin = j;
                }
            }
            if ( indexOfMin != i) {
                int tmp = myArray [i];
                myArray [i] = myArray [ indexOfMin ];
                myArray [ indexOfMin ] = tmp;
            }
        }
        System.out.println("\n--------------------------\n");
        for (int i=0; i< myArray.length; i++) {
            System.out.print(myArray[i]/1000000 + "  ");
        }
    }
}
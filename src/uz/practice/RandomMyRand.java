package uz.practice;

import java.util.Random;

public class RandomMyRand {
    public static void main(String[] args) {
        Random rand= new Random();
        int [] myArray=new int[10];
        int reserv=0;
        for (int i=0; i<myArray.length; i++) {
            myArray[i]=rand.nextInt();
        }
        for (int i=0; i< myArray.length; i++) {
            System.out.print(myArray[i]/1000000 + "  ");
        }
        for (int i=0; i<myArray.length; i++) {
            for (int j=0; j< myArray.length; j++) {
                if (myArray[j]<myArray[i]) {
                    reserv=myArray[j];
                    myArray[j]=myArray[i];
                    myArray[i]=reserv;
                }
            }
        }
        System.out.println("\n-------------------\n");
        for (int i=0; i<myArray.length; i++) {
            System.out.print(myArray[i]/1000000 + "  ");
        }
    }
}

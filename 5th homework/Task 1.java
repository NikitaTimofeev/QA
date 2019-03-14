package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please input integer number of array elements -> ");
        
        int number = sc.nextInt();
        
        int[] arrayInt = createArrayInt(number);

        System.out.println("We had array " + Arrays.toString(arrayInt) + " but after some converter method we already have that thing" + Arrays.toString(converterOfArrays(arrayInt)));
    }


    //    Method for array creation
    static int[] createArrayInt(int size){
        if (size < 1){
            return null;
        }
        int[] arrayInt = new int[size];

        for (int i= 0; i<arrayInt.length; i++){
            arrayInt[i] = (int)(Math.random() * 10);
        }

        return arrayInt;
    }

    
//    Method for convertion array
    static int[] converterOfArrays (int[] array){
        int[] arrayneeded = Arrays.copyOf(array,array.length);

        int temp = 0;
        for (int i = 0 ; i < ((arrayneeded.length) / 2) ; i++){
            temp = arrayneeded[arrayneeded.length - i - 1];
            arrayneeded[arrayneeded.length - i - 1] = arrayneeded[i] ;
            arrayneeded[i] = temp;
        }

        return arrayneeded;
    }
}

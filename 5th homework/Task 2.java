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
        
        System.out.println("We have array " + Arrays.toString(arrayInt));

        System.out.println("Summ of odd numbers -> " + countAndSummOfOddElementsOfArray(arrayInt)[0] + " count -> "  + countAndSummOfOddElementsOfArray(arrayInt)[1]);

    }


    //    Метод для создания массива
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

    
    static int[] countAndSummOfOddElementsOfArray (int[] array){
        int summ = 0;
        int count =0;
        for(int i =0; i<array.length;i++){
            if (array[i] % 2 != 0 ){
                summ += array[i];
                count++;
            }
        }
        int[] Array ={summ,count};
        return Array;
    }
}

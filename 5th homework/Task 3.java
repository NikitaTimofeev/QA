package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input integer number of array elements -> ");
        int number = sc.nextInt();
        
        int[] arrayInt1 = createArrayInt(number);
        int[] arrayInt2 = createArrayInt(number);
        
//        System.out.println("We had array " + Arrays.toString(arrayInt) + " but after some converter method we already have that thing" + Arrays.toString(converter(arrayInt)));
//        System.out.println("Summ of odd numbers -> " + count(arrayInt)[0] + " count -> "  + count(arrayInt)[1]);
        System.out.println("We had 2 arrays -> " + Arrays.toString(arrayInt1)+ " " +
                "AND -> " +Arrays.toString(arrayInt2)+"" +
                "the third array<, which consist of summ elements," +
                " will look like "+ Arrays.toString(summArrays(arrayInt1,arrayInt2)));
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



//  Елементы масива состоют из сумы цифр двух других масивов
    static int[] summArrays (int[] array1,int[] array2) {
        int[] arrayneeded1 = Arrays.copyOf(array1, array1.length);
        int[] arrayneeded2 = Arrays.copyOf(array2, array2.length);
        int[] myArray = new int[array1.length];
        for (int i = 0 ; i <array1.length ; i++){
            myArray[i] = array1[i]+array2[i];
        }
        return myArray;
    }
    
 }

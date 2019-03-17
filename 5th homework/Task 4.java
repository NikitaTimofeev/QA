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
        System.out.println("We have array ->" + Arrays.toString(arrayInt));
        System.out.println("Negative elements is ->" + Arrays.toString(positiveAndNegativeArray(arrayInt)[0]) +
                " Positive elements is -> " + Arrays.toString(positiveAndNegativeArray(arrayInt)[1]));

      }


    //    Метод для создания массива
    static int[] createArrayInt(int size){
        if (size < 1){
            return null;
        }
        int[] arrayInt = new int[size];

        for (int i= 0; i<arrayInt.length; i++){
            arrayInt[i] = (int)(-10+Math.random() * 20);
        }

        return arrayInt;
    }

    static int[][] positiveAndNegativeArray(int[] array){
        int[] sortarray = Arrays.copyOf(array,array.length);
        Arrays.sort(sortarray);


        int negativeCount =0;
        for (int i=0 ;i < array.length; i++ ) {
            if (sortarray[i]<0){
                negativeCount++;
            }
        }
        int[] posArr = new int[sortarray.length-negativeCount];
        int[] negArr = new int[negativeCount];

        int positionP =0,positionN =0;

        for(int i = 0; i<sortarray.length; i++){
            if (sortarray[i]>=0) {
                posArr[positionP] = sortarray[i];
                positionP++;
            } else {
                negArr[positionN] = sortarray[i];
                positionN++;
            }
        }

        int[][] returnArray = {negArr,posArr};

        return returnArray;
    }
}

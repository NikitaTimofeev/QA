package com.company;
import java.util.Scanner;

public class ToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number -> ");
        int var = sc.nextInt();
        String str = ToBinary(var);
        System.out.println( "Your number in binary will be equal " + str);

    }


    static String ToBinary(int var)
    {
        String str = "";
        while (var > 0)
        {
            str =  ((var % 2) == 0 ? "0" : "1") + str;
            var = var/2;
        }
        return str;
    }
} 

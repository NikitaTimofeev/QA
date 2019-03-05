package com.company;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter string -> ");
        String str = sc.nextLine();
        System.out.println("Symbols " +  FindUniquesSymbols(str) +" from " + str +  " are  unique" );
    }

    static String FindUniquesSymbols(String str) {
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            boolean IsUnique = true;
            for (int j= 0; j < str.length(); j++){
                if (i != j && str.charAt(i) == str.charAt(j))
                {
                    IsUnique = false;
                    break;
                }
            }
            if (IsUnique == true){
                str2 += str.charAt(i);
            }
        }
        return str2;
    }
}

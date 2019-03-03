package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    throws java.io.IOException{
        char choice, ignore;
        do{
            System.out.println("Some kind of paint");
            System.out.println(" 1. Press 1 to draw right equilateral triangle ");
            System.out.println(" 2. Press 2 to draw rectangular triangle ");
            System.out.println(" 3. Press 3 to draw another rectangular triangle ");
            System.out.println(" 4. Press 4 to draw left equilateral triangle ");
            System.out.println(" 5. Press 5 to draw Christmas tree");
            System.out.print("Choose: ");

            choice = (char) System.in.read();

            do{
                ignore = (char) System.in.read();

            } while(ignore != '\n');
        } while ( choice < '1' | choice > '5');

        System.out.println("\n");

        switch(choice) {

            case '1':

                for(int count =0;count <10;count++){
                    int t=0;
                    while (t<11){
                        if (t ==count) break;
                        System.out.print(" * ");
                        t++;
                    }
                    System.out.println();
                }
                int count;
                for(count = 0; 10 > count; count++){
                int t=10;
                while (t>0){
                    if (count == t) break;
                    System.out.print(" * ");
                    t--;
                }
                System.out.println();
            }
                break;


            case '2':
                for(int i =0;i <10;i++){
                    for (int j = 0; j < i; j++){
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 10-i; j++){
                        System.out.print("*");
                    }
                    System.out.println( );
                }
                break;
            case '3':
                for(int i =0;i <10;i++){
                for (int j = 0; j < 10-i; j++){
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++){
                    System.out.print("*");
                }
                System.out.println( );
            }
                break;

            case '4':
                for(int i =0;i <10;i++){
                    for (int j = 0; j < 10-i; j++){
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++){
                        System.out.print("*");
                    }
                    System.out.println( );
                }
                for(int i =0;i <10;i++){
                    for (int j = 0; j < i; j++){
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 10-i; j++){
                        System.out.print("*");
                    }
                    System.out.println( );
                }
                break;
            case '5':
                for (int i=0; i<2;++i){
                    for (int j=0;j<=4;++j){
                        for (int z=0; z<= 4-j;++z){
                            System.out.print(' ');
                        }
                        for(int z=0; z<=2*j; ++z){
                            System.out.print('*');
                        }
                        if(j==4){
                            System.out.print(' ');
                        }
                        System.out.println();
                    }
                }
                System.out.println();
                break;
        }
    }
 }


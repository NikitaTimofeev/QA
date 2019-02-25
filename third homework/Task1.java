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
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * *");
                System.out.println("* * * * *");
                System.out.println("* * * *");
                System.out.println("* * *");
                System.out.println("* *");
                System.out.println("*");
                break;
            case '2':
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * *");
                System.out.println("* * * * *");
                break;
            case '3':
                System.out.println("        *");
                System.out.println("      * *");
                System.out.println("    * * *");
                System.out.println("  * * * *");
                System.out.println("* * * * *");
                break;
            case '4':
                System.out.println("        *");
                System.out.println("      * *");
                System.out.println("    * * *");
                System.out.println("  * * * *");
                System.out.println("* * * * *");
                System.out.println("  * * * *");
                System.out.println("    * * *");
                System.out.println("      * *");
                System.out.println("        *");
                break;
            case '5':
                System.out.println("         *");
                System.out.println("        ***");
                System.out.println("      * * * *");
                System.out.println("    * * * * * *");
                System.out.println("  * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                System.out.println("         *");
                System.out.println("        ***");
                System.out.println("      * * * *");
                System.out.println("    * * * * * *");
                System.out.println("  * * * * * * * *");
                System.out.println("* * * * * * * * * *");


                break;
        }
    }
 }


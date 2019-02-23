package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter how many money you want to put on deposit -> ");
        double money = scan.nextInt();

        System.out.print("How many months? Enter here ->");
        int month = scan.nextInt();

        System.out.print("Percents ->");
        int percents = scan.nextInt();


        double raise = (money / 100 * percents) / 12 * month;
        System.out.println("You put "+(int)money+" dollars on "+ month+" month "+" by  "
                + percents+"%\n"+"After " + month + " months, you will receive " +
                (int)raise  + " dollars of revenue");
    }
}

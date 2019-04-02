package hometask6.controller;

import hometask6.model.Book;
import hometask6.model.Books;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a size of books list:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        Books firstShelf = new Books(size);

        firstShelf.addOneBook(101, "Name1", "Ker", "Pub", 1909, 400, 1);
        firstShelf.addOneBook(102, "Name2", "Ep", "lish", 1909, 400, 2);
        firstShelf.addOneBook(103, "Name3", "Map", "er", 2009, 400, 3);
        System.out.println("All books:");
        firstShelf.show();

        changingAllPrices(firstShelf);

        searchByAuthor(firstShelf);

        searchByYear(firstShelf);

    }

    public static void changingAllPrices(Books book){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter percent to change a price (<1 to decrease, >1 to increase):");

        int percent = scan.nextInt();
        book.changingCostByPercent(percent);
        System.out.println("Prices of all books is changed.");
    }

    public static void searchByAuthor(Books book){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an author for searching:");
        String author = scan.nextLine();
        Books result = book.searchByAuthor(author);
        result.show();
    }

    public static void searchByYear(Books record){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year for searching books published after this year:");
        int year = scan.nextInt();
        Books result = record.searchByYear(year);
        result.show();
    }
}

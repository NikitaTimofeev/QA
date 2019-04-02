package hometask6.model;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int countOfPages;
    private int cost;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public Book(int id, String name, String author, String publisher, int year, int countOfPages, int cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.countOfPages = countOfPages;
        this.cost = cost;
    }

    public String view(){
        return this.getClass().getSimpleName() +
                " id = " + this.id +
                " name = " + this.name +
                " author = " + this.author +
                " publisher = " + this.publisher +
                " year = " + this.year +
                " count of pages = " + this.countOfPages +
                " cost = " + this.cost;
    }

}

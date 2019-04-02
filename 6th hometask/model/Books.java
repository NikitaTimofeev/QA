package hometask6.model;

public class Books {
    Book[] array;
    private int size;
    private int percent;

    public Books(int capacity) {
        array = new Book[capacity];
    }

    public void addOneBook(int id, String name, String author,
                           String publisher, int year,
                           int countOfPages, int cost){
        if (this.size < array.length) {
            array[size] = new Book( id,name,author,publisher, year,countOfPages,cost);
            size++;
        } else{
            System.out.println("No free space");
        }
    }

    public void show(){
        for(Book book:array){
            System.out.println(book);
        }
    }

    public void changingCostByPercent(int percent){
        for (int i =0; i< size; i++){
            Book book = array[i];
            book.setCost(book.getCost() * this.percent);
        }
    }

    public Books searchByAuthor(String author){
        Books res = new Books(array.length);
        for (Book book:array){
            if (book.getAuthor().equalsIgnoreCase(author)){
                res.addOneBook(book.getId(),book.getName(),book.getAuthor(),book.getPublisher(),book.getYear(),book.getCountOfPages(),book.getCost());
            }
        }
        return res;
    }

    public Books searchByYear(int year){
        Books res = new Books(array.length);

        for (Book book: array) {

            if (book.getYear() > year){
                res.addOneBook(book.getId(),book.getName(),book.getAuthor(),book.getPublisher(),book.getYear(),book.getCountOfPages(),book.getCost());
            }
        }
        return res;
    }


}

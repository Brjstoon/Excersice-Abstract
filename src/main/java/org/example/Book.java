package org.example;

public class Book extends Product{

    private String author;


    public Book() {
    }

    public Book(String name, double price, int stock , String author) {
        super(name, price, stock);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getDiscount(){
        return getPrice() * 0.4;
    }
    public void purchase(){ //this method will reduce the stck by 1 implying that a purchase just got made
        setStock(getStock()-1);
    }
}

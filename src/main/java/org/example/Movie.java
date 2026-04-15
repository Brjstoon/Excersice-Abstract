package org.example;

public class Movie extends Product{
    private String director;

    public Movie() {
    }

    public Movie(String name, double price, int stock, String director) {
        super(name, price, stock);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public double getDiscount(){
        return getPrice() * 0.2;
    }
    public void purchase(){ //this method will reduce the stck by 1 implying that a purchase just got made
        setStock(getStock()-1);
    }
}

package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // --- Book test ---
        Book book = new Book("The witcher" , 400 , 3 , "Andrzej Sapkowski");
        System.out.println("Book: " + book.getName());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Stock: " + book.getStock());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Discount: $" + book.getDiscount());
        System.out.println("Final price: $" + (book.getPrice() - book.getDiscount()));
        book.purchase();
        System.out.println("Stock after purchase: " + book.getStock());

        System.out.println();

        // --- Movie test ---
        Movie movie = new Movie("The Godfather" , 20 , 20 , "Francis Ford Coppola");
        System.out.println("\nMovie: " + movie.getName());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Stock: " + movie.getStock());
        System.out.println("Price: $" + movie.getPrice() );
        System.out.println("Discount: $" + movie.getDiscount() );
        System.out.println("Final price: $" + (movie.getPrice() - movie.getDiscount()) );
        movie.purchase();
        System.out.println("Stock after purchase: " + movie.getStock());

        System.out.println();

        // --- MovablePoint test ---
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Start -> x: " + p.getX() + ", y: " + p.getY());
        System.out.println("X Speed= " + p.getxSpeed() + " And Y speed= " + p.getySpeed() + "\n");


        p.moveRight();
        System.out.println("After moveRight -> x: " + p.getX() + ", y: " + p.getY());

        p.moveUp();
        System.out.println("After moveUp -> x: " + p.getX() + ", y: " + p.getY());

        p.moveLeft();
        System.out.println("After moveLeft -> x: " + p.getX() + ", y: " + p.getY());

        p.moveDown();
        System.out.println("After moveDown -> x: " + p.getX() + ", y: " + p.getY());



        
    }
}
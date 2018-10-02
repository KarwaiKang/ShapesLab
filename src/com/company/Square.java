package com.company;

public class Square extends Shape {

    // Fields

    private int side;

    // Constructor

    public Square(int side) {
        super("Square");
        this.side = side;
    }

    // Methods

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }
}

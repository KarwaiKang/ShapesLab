package com.company;

public class Rectangle extends Shape {

    // Fields

    private int height;
    private int width;

    // Constructor

    public Rectangle(int height, int width) {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    // Methods

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (2 * height) + (2 * width);
    }
}

package com.company;

public class Circle extends Shape {
    // Fields
    private int radius;

    // Constructor
    public Circle(int inRadius) {
        super("Circle");
        this.radius = inRadius;
    }

    // Methods
    public double getArea() {
        return (Math.PI) * Math.pow(radius, 2.0);
    }
    public double getPerimeter() {
        return (Math.PI) * 2.0 * radius;
    }
}
package com.company;

public class Ellipse extends Shape {
    // Fields
    private int radiusA;
    private int radiusB;

    // Constructor
    public Ellipse(int inRadiusA, int inRadiusB) {
        super("Ellipse");
        this.radiusA = inRadiusA;
        this.radiusB = inRadiusB;
    }

    // Methods
    public double getArea() {
        return (Math.PI) * radiusA * radiusB;
    }
    public double getPerimeter() {
        return 2.0 * (Math.PI) * Math.sqrt(((Math.pow(radiusA, 2.0)) + (Math.pow(radiusB, 2.0))) / 2.0);
    }
}

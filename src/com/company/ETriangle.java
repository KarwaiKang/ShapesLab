package com.company;

public class ETriangle extends Shape {
    //Fieldss
    private int side;

    //Constructor
    public ETriangle(int side)
    {
        super("ETriangle");
        this.side = side;
    }

    //Methods
    public double getArea(){return Math.sqrt(Math.pow(side, 2) - Math.pow(side * 0.5, 2)) * side;}
    public double getPerimeter(){return side*3;}
}

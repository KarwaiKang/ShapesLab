package com.company;

public class Runner {
    public static void main(String[] args) {
        Shape shape1 = new Circle(10);
        Shape shape2 = new Rectangle(10, 5);
        
        System.out.println(shape1);
        System.out.println("My Perimeter is: " + shape1.getPerimeter());
        System.out.println("Area: " + shape1.getArea());
    }
}

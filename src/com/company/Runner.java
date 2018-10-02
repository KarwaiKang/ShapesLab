package com.company;

public class Runner {
    public static void main(String[] args) {
        Shape shape1 = new Circle(10);
        Shape shape2 = new Rectangle(10, 5);
        Shape shape3 = new ETriangle(8);
        Shape shape4 = new Square(7);
        Shape shape5 = new Ellipse(7,8);

        Shape[] shapes = {shape1, shape2, shape3, shape4, shape5};

        for (Shape cur : shapes) {
            System.out.println(cur);
            System.out.println("My area is: " + cur.getArea());
            System.out.println("My Perimeter is: " + cur.getPerimeter() + "\n");
        }
    }
}

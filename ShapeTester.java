package com.company.class24Project1;

public class ShapeTester {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5, 3.14), new Circle.Square(6.5, 6.5)};
        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
        }


    }
}
package com.company.class24Project1;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods
    as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality
    defined in the Shape Interface. Test your code.
     */
    void calculateArea();

    void calculatePerimeter();
}

class Circle implements Shape {
    double radius;
    double pie;

    Circle(double radius, double pie) {
        this.radius = radius;
        this.pie = pie;
    }

    @Override
    public void calculateArea() {
        System.out.println(" The area of a Circle is " + Math.pow(radius, 2));
    }
    @Override
    public void calculatePerimeter() {

    }

    static class Square implements Shape {
        double length;
        double width;

        Square(double length, double width) {
            this.length = length;
            this.width = width;
        }
        public void calculateArea() {
            System.out.println("The are of Square is " + length * width);
        }
        @Override
        public void calculatePerimeter() {

        }
    }
}
package com.company;

public class Question1 {
    public static void main(String[] args) {
        //crete object from classes and calling 2 methods and print them
        //create object from class Circle
        Circle circle1 = new Circle(3);
        System.out.println("The area of the circle is " + circle1.getArea());
        System.out.println("The perimeter of the circle is " + circle1.getPerimeter());

        //create object from class Rectangle
        Rectangle rectangle1 = new Rectangle(4,5);
        System.out.println("The area of the Rectangle is " + rectangle1.getArea());
        System.out.println("The perimeter of the Rectangle is " + rectangle1.getPerimeter());

        //create object from class RightTriangle
        RightTriangle triangle1 = new RightTriangle();
        System.out.println("The area of the Triangle is " + triangle1.getArea());
        System.out.println("The perimeter of the Triangle is " + triangle1.getPerimeter());
    }
}

//create a shape class which contains 2 method
class Shape{
    double getArea(){
        return 0;
    }
    double getPerimeter(){
        return 0;
    }
}

//create class circle which inherit from shape
class Circle extends Shape{
    double radius;

    // Construct a circle with radius 1
    Circle() {
        radius = 1;
    }

    // Construct a circle with a specified radius
    Circle(double newRadius) {
        radius = newRadius;
    }
    // overriding 2 methods
    double getArea() {
        return radius * radius * Math.PI;
    }
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    // Set a new radius for this circle
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}

//create class rectangle which inherit from shape
class Rectangle extends Shape{
    double length;
    double width;

    //construct a rectangle with length of 2 and width of 3
    Rectangle(){
        length = 2;
        width = 3;
    }
    Rectangle(double newLength , double newWidth){
        length = newLength;
        width = newWidth;
    }
    // overriding 2 methods
    double getArea(){
        return length*width;
    }
    @Override
    double getPerimeter() {
        return 2*length+2*width;
    }
    // Set a new length for this rectangle
    void setlength(double newLength) {
        length = newLength;
    }
    // Set a new width for this rectangle
    void setwidth(double newWidth) {
        width = newWidth;
    }
}

//create class RightTriangle  which inherit from shape
class RightTriangle extends Shape {
    double width;
    double height;

    //construct a triangle with a width of 4 and height of 3
    RightTriangle() {
        width = 4;
        height = 3;
    }

    RightTriangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    // overriding 2 methods
    @Override
    double getArea() {
        double area;
        area = (width * height) / 2;
        return area;
    }

    @Override
    double getPerimeter() {
        double h;
        h = Math.hypot(height, width);
        return height + width + h;
    }

    // Set a new width for this triangle
    void setwidth(double newWidth) {
        width = newWidth;
    }

    // Set a new heoght for this triangle
    void setHeight(double newHeight) {
        height = newHeight;
    }
}
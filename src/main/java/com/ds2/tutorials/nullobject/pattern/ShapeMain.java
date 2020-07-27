package com.ds2.tutorials.nullobject.pattern;

public class ShapeMain {

    // TODO - The null object design pattern describes the uses of null objects and their behavior in the system
    //Null object patterns deal with null objects.
    //Instead of checking for the null object, we define null behavior or call do-nothing behavior.
    public static void main(String[] args) {
        String[] shapeTypes = new String[]{"Circle", null, "Triangle", "Pentagon", "Rectangle", "Trapezoid"};
        for (String shapeType : shapeTypes) {
            Shape shape = ShapeFactory.createShape(shapeType);
            // no null-check required since shape factory always creates shape objects
            System.out.println("Shape area: " + shape.area());
            System.out.println("Shape Perimeter: " + shape.perimeter());
            shape.draw();
            System.out.println();
        }
    }
}

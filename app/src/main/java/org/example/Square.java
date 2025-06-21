package org.example;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side); // A square is a rectangle with equal sides
    }

    public double getSide() {
        return getLength(); // Since length and width are the same in a square
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side); // Update both length and width to maintain square properties
    }
    /*
     * The Square class extends Rectangle, inheriting its properties and methods.
     * So it does not need to implement getArea() and getPerimeter() again,
     * as they are already defined in Rectangle.
     * Also the numberOfSides() method is inherited from Rectangle,
     * which returns 4, as a square is a type of rectangle.
     */
}

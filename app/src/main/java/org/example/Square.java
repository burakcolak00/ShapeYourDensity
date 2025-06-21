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
    
}

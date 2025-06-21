package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    void testGetArea() {
        Square square = new Square(4.0);
        double expectedArea = 4.0 * 4.0;
        assertEquals(expectedArea, square.getArea(), 0.0001);
    }

    @Test
    void testGetPerimeter() {
        Square square = new Square(4.0);
        double expectedPerimeter = 4 * 4.0;
        assertEquals(expectedPerimeter, square.getPerimeter(), 0.0001);
    }

    @Test
    void instanceOfShape() {
        Square square = new Square(4.0);
        assertEquals(Rectangle.class, square.getClass().getSuperclass());
    }
}

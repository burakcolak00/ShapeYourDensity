package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        double expectedArea = 4.0 * 5.0;
        assertEquals(expectedArea, rectangle.getArea(), 0.0001);
    }

    @Test
    void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        double expectedPerimeter = 2 * (4.0 + 5.0);
        assertEquals(expectedPerimeter, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void instanceOfShape() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        assertEquals(Shape.class, rectangle.getClass().getSuperclass());
    }
    
    @Test
    void testNumberOfSides() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        assertEquals(4, rectangle.numberOfSides());
    }
}

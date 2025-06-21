package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    void testGetArea() {
        Circle circle = new Circle(5.0);
        double expectedArea = Math.PI * 5.0 * 5.0;
        assertEquals(expectedArea, circle.getArea(), 0.0001);
    }

    @Test
    void testGetPerimeter() {
        Circle circle = new Circle(5.0);
        double expectedPerimeter = 2 * Math.PI * 5.0;
        assertEquals(expectedPerimeter, circle.getPerimeter(), 0.0001);
    }

    @Test
    void instanceOfShape() {
        Circle circle = new Circle(5.0);
        assertEquals(Shape.class, circle.getClass().getSuperclass());
    }
    
}

package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RightTriangleTest {

    @Test
    void testGetArea() {
        RightTriangle triangle = new RightTriangle(3.0, 4.0);
        double expectedArea = 0.5 * 3.0 * 4.0;
        assertEquals(expectedArea, triangle.getArea(), 0.0001);
    }

    @Test
    void testGetPerimeter() {
        RightTriangle triangle = new RightTriangle(3.0, 4.0);
        double hypotenuse = Math.sqrt(3.0 * 3.0 + 4.0 * 4.0);
        double expectedPerimeter = 3.0 + 4.0 + hypotenuse;
        assertEquals(expectedPerimeter, triangle.getPerimeter(), 0.0001);
    }

    @Test
    void instanceOfShape() {
        RightTriangle triangle = new RightTriangle(3.0, 4.0);
        assertEquals(Shape.class, triangle.getClass().getSuperclass());
    }
    
}

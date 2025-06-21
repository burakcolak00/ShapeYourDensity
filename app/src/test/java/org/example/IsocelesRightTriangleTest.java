package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IsocelesRightTriangleTest {

    @Test
    void testGetArea() {
        IsocelesRightTriangle triangle = new IsocelesRightTriangle(5.0);
        double expectedArea = 0.5 * 5.0 * 5.0;
        assertEquals(expectedArea, triangle.getArea(), 0.0001);
    }

    @Test
    void testGetPerimeter() {
        IsocelesRightTriangle triangle = new IsocelesRightTriangle(5.0);
        double hypotenuse = 5.0 * Math.sqrt(2);
        double expectedPerimeter = 5.0 + 5.0 + hypotenuse;
        assertEquals(expectedPerimeter, triangle.getPerimeter(), 0.0001);
    }

    @Test
    void instanceOfShape() {
        IsocelesRightTriangle triangle = new IsocelesRightTriangle(5.0);
        assertEquals(RightTriangle.class, triangle.getClass().getSuperclass());
    }

    @Test
    void testNumberOfSides() {
        IsocelesRightTriangle triangle = new IsocelesRightTriangle(5.0);
        assertEquals(3, triangle.numberOfSides());
    }
}

package org.example;

public class IsocelesRightTriangle extends RightTriangle{
    private double legLength;

    public IsocelesRightTriangle(double legLength) {
        super(legLength, legLength);
        this.legLength = legLength;
    }

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength(double legLength) {
        this.legLength = legLength;
        super.setBase(legLength);
        super.setHeight(legLength);
    }
    /*
     * The IsocelesRightTrianle class extends RightTrieangle, inheriting its properties and methods.
     * So it does not need to implement getArea() and getPerimeter() again,
     * as they are already defined in RightTrieangle.
     * Also the numberOfSides() method is inherited from RightTrieangle,
     * which returns 3, as a IsocelesRightTrianle is a type of RightTrieangle.
     */
}

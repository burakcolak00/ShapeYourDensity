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
    
}

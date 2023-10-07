package SOLID.ISP;

public class PyramidRegular implements iShape, iShape3D{
    private int a;
    private int h;
    private int hSide;


    public PyramidRegular(int a, int h, int hSide) {
        this.a = a;
        this.h = h;
        this.hSide = hSide;
    }


    @Override
    public double volumeCalculate() {
        double volume = (a*a*h)/3;
        return volume;
    }

    @Override
    public double squareCalculate() {
        double square = a*(a + 2*hSide);
        return square;
    }
    
}

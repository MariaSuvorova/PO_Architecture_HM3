package SOLID.ISP;

public class PyramidRegular implements iShape3D{
    private int a;
    private int h;

    public PyramidRegular(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double volumeCalculate() {
        double volume = (a*a*h)/3;
        return volume;
    }
    
}

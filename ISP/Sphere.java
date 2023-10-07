package SOLID.ISP;

public class Sphere implements iShape, iShape3D{
    private int radius;
    
    public Sphere(int radius) {
        this.radius = radius;
    }


    @Override
    public double volumeCalculate() {
        double volume = (4*3.14*Math.pow(radius, 3)/3);
        return volume;
    }


    @Override
    public double squareCalculate() {
        double square = 4*3.14*radius*radius;
        return square;
    }
    
}

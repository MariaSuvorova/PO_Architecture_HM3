package SOLID.ISP;

public class Circle implements iShape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double squareCalculate() {
        return 3.14*radius*radius;
    }
}

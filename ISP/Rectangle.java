package SOLID.ISP;

public class Rectangle implements iShape{
    private int a;
    private int b;
    private int c;

    public Rectangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double squareCalculate() {
        double p = (a+b+c)/2.0;
        double square = (double) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }
}



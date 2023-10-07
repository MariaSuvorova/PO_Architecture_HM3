package SOLID.ISP;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4, 5);
        System.out.println(rectangle.squareCalculate());

        PyramidRegular pyramid = new PyramidRegular(4, 5, 3);
        System.out.println(pyramid.volumeCalculate());
        System.out.println(pyramid.squareCalculate());
    }
}

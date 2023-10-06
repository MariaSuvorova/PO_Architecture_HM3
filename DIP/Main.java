package SOLID.DIP;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new EngineDiz());
        car1.start();

        Car car2 = new Car(new EnginePetrol());
        car2.start();
    }
}

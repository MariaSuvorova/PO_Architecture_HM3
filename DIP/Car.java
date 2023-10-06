package SOLID.DIP;

public class Car{
    iEngine engine;

    public Car(iEngine engine) {
        this.engine = engine;
    }

    void start(){
        engine.start();
        System.out.println("Car start");
    };
}
package base;

public class Car extends Vehicle {
    public Car(Boolean hasRoof) {
        super(hasRoof);
        this.numOfWheels = 4;
    }

    public void whatAmI() {
        System.out.println("I am a Car");
    }
}

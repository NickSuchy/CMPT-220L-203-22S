package base;

public class Bike extends Vehicle implements Upholstery, Leather, Plastic {
    Integer example = 7;
    public Bike(Boolean hasRoof) {
        super(hasRoof);
        this.numOfWheels = 2;
    }

    public void whatAmI() {
        System.out.println("I am a Bike");
    }

    public void go(){
        example = 10;
        System.out.println("I'm going!");
        System.out.println(this.example);
    }

    public void cleaningInstructions() {

    }
}

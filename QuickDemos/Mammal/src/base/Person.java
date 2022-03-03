package base;

public class Person extends Mammal{
    String SSN;
    Integer Intelligence;
    boolean hasHair;

    public Person(boolean hasFur, Integer height, Integer weight, String SSN, Integer Intelligence, boolean hasHair){
        super(hasFur, height, weight);
        this.SSN = SSN;
        this.Intelligence = Intelligence;
        this.hasHair = hasHair;
    }
}

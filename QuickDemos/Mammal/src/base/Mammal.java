package base;

public class Mammal {
    boolean hasFur;
    boolean hasVertabae;
    Integer height;
    Integer weight;
    boolean giveBirth;

    public Mammal(boolean hasFur, Integer height, Integer weight) {
        this.hasFur = hasFur;
        this.hasVertabae = true;
        this.height = height;
        this.weight = weight;
        this.giveBirth = true;
        announce();
    }

    public void announce(){
        System.out.println("Hey I'm a Mammal");
    }
}

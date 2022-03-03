package base;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mammal fred = new Mammal(true, 70, 200);
        Person jess = new Person(true, 70, 200, "111-11-1111", 100, false);
        System.out.println(fred.weight);
        System.out.println(jess.weight);
        System.out.println(jess.SSN);
    }
}

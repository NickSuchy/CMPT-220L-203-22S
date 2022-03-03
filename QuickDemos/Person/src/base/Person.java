package base;

public class Person {
    int age;
    String firstName;
    String lastName;
    // String phone_number;
    // String height;
    // String weight;

    public Person (int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void whoAmI(){
        System.out.println(String.format("Hi, I'm %s %s and I'm %d years old", this.firstName, this.lastName, this.age));
    }

}

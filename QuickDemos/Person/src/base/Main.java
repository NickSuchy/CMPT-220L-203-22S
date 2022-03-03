package base;

public class Main {

    public static void main(String[] args) {
        int hexByte = 0xFF;
        Person kipp = new Person(27, "Aaron", "Kippins");
        kipp.whoAmI();
        sayHello();
    }

    public static void sayHello() {
        System.out.println("Say Hello");
    }
}

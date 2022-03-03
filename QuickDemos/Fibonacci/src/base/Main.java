package base;

public class Main {

    public static void main(String[] args) {
	// write your code here
        fibonnaci(5);
    }

    public static Integer fibonnaci(Integer index) {
        if (index == 0 || index == 1) {
            return 1;
        } else {
            Integer result = fibonnaci(index - 1) + fibonnaci(index - 2);
            return result;
        }
    }
}

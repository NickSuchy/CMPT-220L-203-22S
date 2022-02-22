package base;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        // Give me an example of you using switch case.
        String freeTopping = "Whipped Cream";
        switch(freeTopping){
            case("Chocolate Chips"):
                System.out.println("Your free topping is Chocolate Chips");
                break;
            case("Whipped Cream"):
                System.out.println("Your free topping is Whipped Cream");
                break;
            case("Sprinkles"):
                System.out.println("Your free topping is Sprinkles");
                break;
            default:
                System.out.println("You choose to not get a free topping");
                break;
        }

        // Give me an example of you using a for loop
        int age = 5;
        for(int count = 1; count <= age; count++){
            System.out.println("Are you " + count);
        }

        // Give me an example of you using a while loop
        int num = 7;
        int loops = 0;
        while(loops != num){
            System.out.println("I hope this one stops this");
            loops++;
        }
        System.out.println("It finally stopped");

        System.out.println("The answer of 2^3 is " + exponents(2,3));

        int[] numsList = {2,3,5,2,3,6,7,8,2};
        System.out.println("The target number occurs " + howManyTimes(2, numsList) + " times");
        System.out.println("The sum of the list is " + summation(numsList));
        System.out.println("The value of c is: " + pythagorean(3, 4));
    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */

    static int exponents(int num1, int num2){
        return (int) (Math.pow(num1, num2));
    }

    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */

    static int howManyTimes(int targetNum, int[] listNums){
        int occur = 0;
        for (int num: listNums){
            if (num == targetNum){
                occur++;
            }
        }
        return occur;
    }

    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */

    static int summation(int[] toBeAdded){
        int sum = 0;
        for(int part:toBeAdded){
            sum = sum + part;
        }
        return sum;
    }

    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */

    static int pythagorean(int a, int b){
        return (int) Math.sqrt(addition(exponents(a,2), exponents(b,2)));
    }

    static int addition(int a, int b) {
        return a + b;
    }

    int division(int a, int b) {
        return a / b;
    }
}

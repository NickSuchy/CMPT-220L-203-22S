package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {

        // Make an if statement that triggers a print or println statement
        int x = 7;
        if (x == 7) {
            System.out.println("Lucky number 7");
        }

        // Make an if, else statement where the else statement triggers a print or println statement
        int y = 63;
        if (y > 64) {
            System.out.println("You passed the test");
        } else{
            System.out.println("You failed the test");
        }

        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        int temp = 64;
        if (temp < 32) {
            System.out.println("It is cold.");
        } else if (temp < 75) {
            System.out.println("It is warm.");
        } else {
            System.out.println("It is hot");
        }

        // Make 2 variables and use them in an if else conditional print from one of the sections
        int a = 10;
        int b = 5;
        if (a > b) {
            System.out.println("a is bigger");
        } else {
            System.out.println("b is bigger");
        }

        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        boolean heads = true;
        boolean evenRoll = true;
        if (heads && evenRoll) {
            System.out.println("Winner!");
        } else {
            System.out.println("Loser");
        }

        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        boolean hotdog = true;
        boolean hamburger = true;
        if (hotdog || hamburger) {
            System.out.println("Barbeque night");
        } else {
            System.out.println("Order takeout");
        }
        }
        }


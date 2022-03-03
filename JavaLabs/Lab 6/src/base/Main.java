package base;

import java.util.*;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating a LinkedList
     * - Creating a Queue
     * - Creating a Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {
       
        // Create an Array, Populate it, and Print it out
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i = 0; i < months.length; i++ ){
            System.out.println(months[i]);
        }

        // Create an ArrayList, Populate it, and Print it out
        ArrayList<Integer> evenNums = new ArrayList(Arrays.asList(2, 4, 6, 8));
        evenNums.add(10);
        for(int i = 0; i < evenNums.size();  i++){
            System.out.println(evenNums.get(i));
        }

        // Create a LinkedList, Populate it, and Print it out
        LinkedList<String> days = new LinkedList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println(days);

        // Create a Queue, Populate it, and Print it out
        Queue<String> inHouse = new LinkedList<String>();
        inHouse.add("Nick");
        inHouse.add("Andrew");
        inHouse.add("Grace");
        inHouse.add("Benny");
        System.out.println(inHouse);

        // Create a Stack, Populate it, and Print it out
        Stack<String> dishes = new Stack<String>();
        dishes.push("Frying Pan");
        dishes.push("Dinner Plate");
        dishes.push("Cups");
        dishes.push("Utensils");
        dishes.pop();
        for(int i = 0; i < dishes.size(); i++){
            System.out.println(dishes.get(i));
        }

        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        Plant inKitchen = new Plant(false, "Shrub", "Moon Cactus");
        Plant inLivingRoom = new Plant(true, "Flower", "Rose");
    }
}

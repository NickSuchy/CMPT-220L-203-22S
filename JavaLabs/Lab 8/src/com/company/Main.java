package com.company;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> itemValues = new ArrayList();

    public static void main(String[] args) {

        //Assign Values
        listItem first = new listItem(1);
        itemValues.add(first.value);
        listItem second = new listItem(2);
        itemValues.add(second.value);
        listItem third = new listItem(3);
        itemValues.add(third.value);
        listItem fourth = new listItem(4);
        itemValues.add(fourth.value);
        listItem fifth = new listItem(5);
        itemValues.add(fifth.value);

        //Link Nodes
        first.order = second;
        second.order = third;
        third.order = fourth;
        fourth.order = fifth;

        fifth.addItem(6, itemValues);

        fourth.deleteItem(third, itemValues);

        first.printListFrom(itemValues);
    }
}

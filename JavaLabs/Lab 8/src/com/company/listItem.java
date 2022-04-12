package com.company;
import java.util.ArrayList;

public class listItem {
    int value;
    listItem order;

    public listItem(int value){
        this.value = value;
        this.order = null;
    }

    public ArrayList addItem(int value, ArrayList<Integer> itemValues){
        listItem newItem = new listItem(value);
        itemValues.add(newItem.value);
        this.order = newItem;
        System.out.println("Item has been added with a value of: " + newItem.value);
        return itemValues;
    }

    public ArrayList deleteItem(listItem previous, ArrayList<Integer> itemValues){
        int start = 0;
        for(int values: itemValues){
            if(values == this.value){
                break;
            }
            start++;
        }
        previous.order = this.order;
        itemValues.remove(start);
        this.order = null;
        System.out.println("The item " + this + " with a value of " + this.value + " has been removed from the list");
        return itemValues;
    }

    public void printListFrom(ArrayList<Integer> itemValues){
        ArrayList<listItem> toPrint = new ArrayList();
        listItem adding = this;
        for(int values: itemValues){
            toPrint.add(adding);
            adding = adding.order;
        }
        System.out.println("The current list starting from " + this + ": " + toPrint);
    }
}

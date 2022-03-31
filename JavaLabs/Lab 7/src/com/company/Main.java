package com.company;

public class Main {

    public static void main(String[] args) {
        listItem fifth = new listItem(5, null);
        listItem fourth = new listItem(4, fifth);
        listItem third = new listItem(3, fourth);
        listItem second = new listItem(2, third);
        listItem first = new listItem(1, second);

        System.out.println(first);
        System.out.println(first.order);
        System.out.println(second);
        System.out.println(second.order);
        System.out.println(third);
        System.out.println(third.order);
        System.out.println(fourth);
        System.out.println(fourth.order);
        System.out.println(fifth);
        System.out.println(fifth.order);
    }
}
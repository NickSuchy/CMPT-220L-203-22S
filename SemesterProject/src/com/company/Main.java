package com.company;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        //Creates the tree
        System.out.println("------Creating the initial tree------");
        tree.add(4);
        tree.add(2);
        tree.add(6);
        tree.add(10);
        tree.add(8);
        System.out.println();

        //Inserts an element into the tree
        System.out.println("------Inserting a value into the tree------");
        tree.add(5);
        System.out.println();

        //Finds an element of equal value in the tree
        System.out.println("------Searching for elements in the tree------");
        tree.findElement(5, true);
        tree.findElement(11, true);
        System.out.println();

        //Finds the height of the tree
        System.out.println("------Finding the height of the tree------");
        tree.findHeight();
        System.out.println();

        //Finds the smallest element in the tree
        System.out.println("------Finding the minimum element of the tree------");
        tree.findMin();
        System.out.println();

        //Finds the largest element in the tree
        System.out.println("------Finding the maximum element of the tree------");
        tree.findMax();
        System.out.println();

        //Finds the nth largest element in the tree
        System.out.println("------Finding the nth largest element of the tree------");
        tree.findNth(2);
        System.out.println();

        //Lists the elements of the tree in-order
        System.out.println("------In-Order Traversal------");
        System.out.println("The tree printed in-order is: " + tree.listInOrder());
        System.out.println();

        //Lists the elements of the tree pre-order
        System.out.println("------Pre-Order Traversal------");
        System.out.println("The tree printed pre-order is: " + tree.listPreOrder());
        System.out.println();

        //Lists the elements of the tree post-order
        System.out.println("------Post-Order Traversal------");
        System.out.println("The tree printed post-order is: " + tree.listPostOrder());
        System.out.println();

        //Performs a depth first search
        System.out.println("------Depth-First Search------");
        tree.depthFirstSearch(10);
        System.out.println();

        //Performs a breadth first search
        System.out.println("------Breadth-First Search------");
        tree.breadthFirstSearch(10);
        System.out.println();

        //Deletes an element in the tree and reorganizes
        System.out.println("------Deleting a node from the tree------");
        tree.deleteNode(10);
        System.out.println();
        System.out.println("------The traversals of the new tree------");
        System.out.println("The tree printed in-order is: " + tree.listInOrder());
        System.out.println("The tree printed pre-order is: " + tree.listPreOrder());
        System.out.println("The tree printed post-order is: " + tree.listPostOrder());

    }
}

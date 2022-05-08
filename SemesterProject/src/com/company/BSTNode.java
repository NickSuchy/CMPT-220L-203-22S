package com.company;

public class BSTNode {
    int value;
    BSTNode left;
    BSTNode right;
    int depth;

    public BSTNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.depth = 0;
    }
}

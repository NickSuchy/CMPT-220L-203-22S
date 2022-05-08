package com.company;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTree {
    BSTNode root;
    int length;
    int height;

    public BinarySearchTree(){
        //this.root is the starting root of the tree
        this.root = null;
        this.length = 0;
        this.height = 0;
    }

    /**
     * Creates nodes from a specified value and links them together.
     * Nodes are linked in a sorted fashion to create a Binary Search Tree
     * where each parent node has a max of two children and nodes with lower
     * values than their parent are linked to the left while nodes with
     * a higher value than the parent are linked to the right.
     * <p>
     * The first node assigned a value is also assigned to the variable
     * this.root and acts as the root of the whole tree. Additionally,
     * each individual node's depth is tracked.
     * <p>
     * The method also keeps track of how many nodes are in the tree
     * (this.length) and the height of the tree (this.height).
     * @param value  holds value of the newly declared Node
     */
    public void add(int value){
        //Creates the starting root for the whole tree
        int nodeDepth = 0; //keeps track of the depth of each node
        BSTNode tempNode;
        if(this.root == null){
            this.root = new BSTNode(value);
            this.root.depth = nodeDepth;
            System.out.println("The value " + value + " has been added to the tree with a depth of " + nodeDepth);
        } else { //uses logic to find the next open space, and the next correct space for a Node to be added
            tempNode = this.root;
            while(tempNode.left != null || tempNode.right != null) { //skips when the current root has no children
                if((tempNode.left == null && value < tempNode.value) || (tempNode.right == null && value > tempNode.value)){
                    break;
                }
                if(tempNode.left != null && value < tempNode.value){ //moves down one level to the left
                    tempNode = tempNode.left;
                }
                if(tempNode.right != null && value > tempNode.value){ //moves down one level to the right
                    tempNode = tempNode.right;
                }
            }
            nodeDepth = tempNode.depth + 1;
            if(value < tempNode.value){ //creates a new Node at the open location found in the loop
                tempNode.left = new BSTNode(value);
                tempNode.left.depth = nodeDepth;
            } else {
                tempNode.right = new BSTNode(value);
                tempNode.right.depth = nodeDepth;
            }
            if(this.height < nodeDepth){
                this.height = nodeDepth;
            }
            System.out.println("The value " + value + " has been added to the tree with a depth of " + nodeDepth);
        }
        this.length += 1;
    }

    /**
     * Searches the tree for a target value indicated by target. If found,
     * the method returns true. The print statements within the method are
     * optional to print indicated by toPrint.
     * <p>
     * The method uses basic Binary Search Tree logic to navigate the
     * tree. If the target is greater than the current node's value
     * the comparison moves to the right, otherwise the comparison
     * moves to the left.
     * @param target Holds the value that is being searched for
     * @param toPrint Holds a boolean value that, when true, prints
     *                statements to see the results of the method
     * @return A boolean value declaring, if true, that the target
     * was in the tree
     */
    public boolean findElement(int target, boolean toPrint){
        boolean isInTree = false;
        BSTNode tempNode = this.root;
        while(tempNode != null){ //repeats if the current Node exists
            if(target == tempNode.value){ //checks is current node value equals target value
                isInTree = true;
                break;
            } else {
                if(target < tempNode.value){ //moves left or right in tree based on target and current node value
                    tempNode = tempNode.left;
                } else {
                    tempNode = tempNode.right;
                }
            }
        }
        if(toPrint) {
            if (isInTree) { //uses logic to print out the correct statement
                System.out.println("The value " + target + " is in the tree.");
            } else {
                System.out.println("The value " + target + " is not in the tree");
            }
        }
        return isInTree;
    }

    /**
     * Returns a print statement which contains the height of the tree
     * found in the add() method.
     * @see BinarySearchTree add()
     */
    public void findHeight(){
        System.out.println("The height of the tree is: " + this.height);
    }

    /**
     * Returns a print statement containing the value of the
     * smallest node in the tree.
     */
    public void findMin(){
        BSTNode tempNode = this.root;
        while(tempNode.left != null){ //travels down the left side of the tree to reach the smallest element
            tempNode = tempNode.left;
        }
        System.out.println("The minimum value in the tree is: " + tempNode.value);
    }

    /**
     * Returns a print statement containing the value of the
     * largest node in the tree.
     */
    public void findMax(){
        BSTNode tempNode = this.root;
        while(tempNode.right != null){ //travels down the right side of the tree to find the largest element
            tempNode = tempNode.right;
        }
        System.out.println("The maximum value in the tree is: " + tempNode.value);
    }

    /**
     * Returns a print statement containing the value of the
     * nth largest node in the tree. A switch case is used here
     * in order to get correct grammar.
     * <p>
     * The method calls listInOrder() to find the nth largest
     * element.
     * </p>
     * @param placement holds the value of "n". If placement is 1,
     *                  the method returns the largest value in the
     *                  tree. If placement is 2, the method returns
     *                  the 2nd largest value in the tree and so on.
     * @see BinarySearchTree listInOrder()
     */
    public void findNth(int placement){
        if(placement > this.length){ //checks if placement is out of range of the list
            System.out.println("The index you are searching for is out of range of the current tree (length = " + this.length + ").");
        } else {
            switch(placement){ //uses logic to print the grammatically correct statement
                case 1: System.out.println("The largest value in the tree is: " + listInOrder().get(this.length - 1));
                    break;
                case 2: System.out.println("The " + placement + "nd largest value in the tree is: " + listInOrder().get(this.length - 2));
                    break;
                case 3: System.out.println("The " + placement + "rd largest value in the tree is: " + listInOrder().get(this.length - 3));
                    break;
                default: System.out.println("The " + placement + "th largest value in the tree is: " + listInOrder().get(this.length - placement));
                    break;
            }
        }
    }

    /**
     * The method deletes a single node from the tree and
     * then reorganizes the tree. The node replaced is the
     * in order successor, or the in order predecessor (if
     * there is no in order successor).
     * @param target Holds the value the is to be deleted.
     *               If a node with this value is found,
     *               the method proceeds to remove it from
     *               the tree
     * @see BinarySearchTree findElement()
     */
    public void deleteNode(int target){

        //checks to see if the target value is in the tree using findElement()
        if(!findElement(target, false)){
            System.out.println("The value that is trying to be deleted does not exist in the tree");
        } else {
            BSTNode tempNode = this.root; //holds the node that is currently being compared
            BSTNode parent = null; //holds the parent of the node that is being deleted
            BSTNode toBeDeleted = null; //holds the node that is going to be removed from the tree
            BSTNode parentOfChange; //holds the parent of the node that is replacing deleted node
            BSTNode changingNode = null; //holds the node that is replacing the deleted node
            boolean left = true; //used to tell if changingNode gets added to the left or right of parent

            //checks if root of the tree is being deleted
            if(target == this.root.value){
                toBeDeleted = this.root;
            }

            //traverses the tree while checking for the to be deleted node
            while(toBeDeleted == null) { //repeats until target node is found
                if(tempNode.left != null && target == tempNode.left.value) { //checks if the left child is the target
                    parent = tempNode;
                    toBeDeleted = parent.left;
                }
                if(tempNode.right != null && target == tempNode.right.value){ //checks if the right child is the target
                    parent = tempNode;
                    toBeDeleted = parent.right;
                    left = false;
                } else {
                    if (target < tempNode.value && tempNode.left != null) { //moves left or right in tree based on target and current node value
                        tempNode = tempNode.left;
                    } else {
                        if(tempNode.right != null){
                            tempNode = tempNode.right;
                        }
                    }
                }
            }

            //finds the inorder successor of the node that is being deleted
            if(toBeDeleted.right != null){
                parentOfChange = toBeDeleted;
                changingNode = toBeDeleted.right;
                if(changingNode.left == null){
                    toBeDeleted.right = null;
                } else {
                    while (changingNode.left != null) {
                        parentOfChange = changingNode;
                        changingNode = changingNode.left;
                    }
                    parentOfChange.left = changingNode.right;
                }
            } else { //find the in order predecessor of the node that is being deleted
                if(toBeDeleted.left != null){
                    parentOfChange = toBeDeleted;
                    changingNode = toBeDeleted.left;
                    if(changingNode.right == null){
                        toBeDeleted.left = null;
                    } else {
                        while(changingNode.right != null){
                            parentOfChange = changingNode;
                            changingNode = changingNode.right;
                        }
                        parentOfChange.right = changingNode.left;
                    }
                }
            }

            //sets the deleted child of the parent to changingNode
            if(parent != null){
                if(left){
                    parent.left = changingNode;
                } else {
                    parent.right = changingNode;
                }
            } else { //if the root of the tree was deleted, the changing node becomes the new root
                this.root = changingNode;
            }

            //changingNode obtains the children of the deleted node
            if(changingNode != null){
                changingNode.left = toBeDeleted.left;
                changingNode.right = toBeDeleted.right;
            }

            //the deleted node is unlinked from the tree and the length of the tree is reduced by 1
            toBeDeleted.left = null;
            toBeDeleted.right = null;
            this.length -= 1;
            System.out.println("The value " + target + " has been successfully removed from the tree");
        }
    }

    /**
     * Returns the list of elements in the tree in-order (Left, Root, Right).
     * @return The in-order list of all the node values in the tree
     */
    public ArrayList<Integer> listInOrder(){
        Stack<BSTNode> tempStack = new Stack<>(); //used to travel back up the tree
        ArrayList<Integer> inOrderValues = new ArrayList<>(); //holds values in order
        tempStack.push(this.root);
        BSTNode tempNode = this.root;
        while(inOrderValues.size() < this.length){
            //when there is a left child move to the left
            while(tempNode.left != null && !inOrderValues.contains(tempNode.left.value)){
                tempNode = tempNode.left;
                tempStack.push(tempNode);
            }
            inOrderValues.add(tempNode.value); //adds leftmost not-already-included value

            //changes current node to right child if there is one
            if((tempNode.right != null && !inOrderValues.contains(tempNode.right.value)) || tempStack.size() <= 1){
                tempStack.pop();
                tempNode = tempNode.right;
                tempStack.push(tempNode);
            } else { //changes current node back to parent node if there is no right child
                tempNode = tempStack.get(tempStack.size() - 2);
                tempStack.pop();
            }
        }
        return inOrderValues;
    }

    /**
     * Returns the list of elements in the tree pre-order (Root, Left, Right).
     * @return The list of pre-order values of all nodes in the tree
     */
    public ArrayList<Integer> listPreOrder(){
        Stack<BSTNode> tempStack = new Stack<>(); //holds parent nodes to travel up tree
        ArrayList<Integer> preOrderValues = new ArrayList<>(); //holds values in pre-order
        tempStack.push(this.root);
        BSTNode tempNode = this.root;
        while(preOrderValues.size() < this.length){

            //adds the current node to the pre-ordered list
            if(!preOrderValues.contains(tempNode.value)){
                preOrderValues.add(tempNode.value);
            }

            //moves left if there is a left child
            if(tempNode.left != null && !preOrderValues.contains(tempNode.left.value)){
                tempNode = tempNode.left;
                tempStack.push(tempNode);
            } else { //otherwise, moves right if there is a right child
                if(tempNode.right != null && !preOrderValues.contains(tempNode.right.value)){
                    tempNode = tempNode.right;
                    tempStack.push(tempNode);
                } else { //goes back to parent
                    tempStack.pop();
                    tempNode = tempStack.get(tempStack.size()-1);
                }
            }
        }
        return preOrderValues;
    }

    /**
     * Returns the list of elements in the tree post-order (Left, Right, Root).
     * @return The list of post-order values of all nodes in the tree
     */
    public ArrayList<Integer> listPostOrder(){
        Stack<BSTNode> tempStack = new Stack<>(); //holds parent nodes
        ArrayList<Integer> postOrderValues = new ArrayList<>(); //hold values in post-order
        tempStack.push(this.root);
        BSTNode tempNode = this.root;
        while(postOrderValues.size() < this.length){
            //when there is a left child move left
            while(tempNode.left != null && !postOrderValues.contains(tempNode.left.value)){
                tempNode = tempNode.left;
                tempStack.push(tempNode);
            }
            //moves right when there is a right child
            if(tempNode.right != null && !postOrderValues.contains(tempNode.right.value)){
                tempNode = tempNode.right;
                tempStack.push(tempNode);
            } else { //adds the current node and then travels back up the tree using the current nodes parents
                while((tempNode.right == null || postOrderValues.contains(tempNode.right.value)) && postOrderValues.size() < this.length){
                    postOrderValues.add(tempNode.value);
                    if(tempStack.size() >= 2) {
                        tempStack.pop();
                        tempNode = tempStack.get(tempStack.size() - 1);
                    }
                }
            }
        }
        return postOrderValues;
    }

    /**
     * Prints a statement containing a boolean declaring if the
     * target is in the tree. While this performs the same action
     * findElement(), it is functionally different in the way that
     * the method performs the search. This method searches using
     * post-order traversal (Left, Right, Root).
     * @param target Holds the value that is being searched for
     */
    public void depthFirstSearch(int target){
        Stack<BSTNode> tempStack = new Stack<>(); //holds parent nodes
        ArrayList<Integer> alreadyChecked = new ArrayList<>(); // holds nodes that have already been checked
        boolean isInTree = false; //used to determine what print statement will be produced
        int numComparisons = 0; //keeps track of how many comparisons with the target were made
        tempStack.push(this.root);
        BSTNode tempNode = this.root;
        while(alreadyChecked.size() < this.length){

            //when there is a left child move left
            while(tempNode.left != null && !alreadyChecked.contains(tempNode.left.value)){
                tempNode = tempNode.left;
                tempStack.push(tempNode);
            }

            //moves right when there is a right child
            if(tempNode.right != null && !alreadyChecked.contains(tempNode.right.value)){
                tempNode = tempNode.right;
                tempStack.push(tempNode);
            } else {
                numComparisons += 1;

                //checks to see if the current node is equal to the target
                if(tempNode.value == target){
                    isInTree = true;
                    break;
                } else { //goes back to parent
                    alreadyChecked.add(tempNode.value);
                    if(tempStack.size() >= 2) {
                        tempStack.pop();
                        tempNode = tempStack.get(tempStack.size() - 1);
                    }
                }
            }
        }
        if(isInTree){
            System.out.println("The value " + target + " was found after " + numComparisons + " comparisons.");
        } else {
            System.out.println("The value " + target + " was not found in the tree.");
        }
    }

    /**
     * Prints a statement containing a boolean declaring if the
     * target is in the tree. While this performs the same action
     * findElement(), it is functionally different in the way that
     * the method performs the search. This method searches the tree
     * from left to right and top to bottom.
     * @param target Holds the value that is being searched for
     */
    public void breadthFirstSearch(int target){
        Queue<BSTNode> tempQueue = new LinkedList<>(); //holds parent nodes
        boolean isInTree = false;
        int numComparisons = 0; //keeps track of how many comparisons with the target were made
        tempQueue.add(this.root);
        BSTNode tempNode = this.root;

        //repeats the length of the tree so that every node is compared once
        for(int i = 0; i < this.length; i++){
            numComparisons += 1;

            //checks to see if the current node is equal to the target
            if(tempNode.value == target){
                isInTree = true;
                break;
            } else {

                //adds the left child of the node to the queue is there is one
                if(tempNode.left != null){
                    tempQueue.add(tempNode.left);
                }

                //adds the right child of the node to the queue is there is one
                if(tempNode.right != null){
                    tempQueue.add(tempNode.right);
                }

                //removes the first item in the queue and sets the current node to the next item in queue
                tempQueue.remove();
                tempNode = tempQueue.peek();
            }
        }
        if(isInTree){
            System.out.println("The value " + target + " was found after " + numComparisons + " comparisons.");
        } else {
            System.out.println("The value " + target + " was not found in the tree.");
        }
    }
}
# Semester Project: Binary Search Tree
Nicholas Suchy

## Introduction

---

The purpose of the program is to create a functional
Binary Search Tree (BST). In addition to simply creating 
a BST, the program also includes several common methods that
would be used in coordination with a BST. By using the
methods described below, users are able to do a wide variety
of things from simply creating the tree to performing various
searches within the tree.

## Creating Elements

---

Method Focus: `add()`

Nodes and branches are what make up th body of a Binary Search
Tree. When adding nodes to a BST there are certain rules that
have to be followed in order for the resulting tree to be 
classified as a BST:

- There must be 1 root node for the whole tree
- No node can have more than 2 children but can have as few as 0
- Nodes with values less than their parent value will be added to the left
- Nodes with values greater than their parent value will be added to the right

Because there is only one root for the whole tree, denoted as
`this.root` throughout the program, the program takes the first
input as the root node of the tree and makes the logic comparisons
to find where subsequent nodes should go.

### Inserting Elements

Inserting elements uses the same location finding process
as when the program is initially adding a node

## Searching the Tree

---

As Binary Search Trees are a form of sorted tree, one of
their strengths is in the eas-ability to search for elements

### Finding Elements

Method Focus: `findElement()`

This method uses the same logical comparisons used to 
create the tree, except makes the comparisons with a variable
holding a target value and continues making comparisons until
a node with a similar value is found or until the bottom of 
the tree is hit.

### Finding the Height of the Tree

Method Focus: `findHeight()` `add()`

The height of a BST is the largest number of branches, or 
comparisons, used to travel from the root to the bottom of 
the tree. When nodes are being initially added to the tree,
the number of comparisons it takes for them to find an open
spot to stay is recorded. This number corresponds to the 
number of branches that connect it to the root of the tree.
The node (or nodes) with the greatest depth represent the
height of the tree.

### Finding the Minimum and Maximum Elements

Method Focus: `findMin()` `findMax()`

Since BST are sorted where a smaller value goes left of a parent
and a larger value goes right of a parent, the minimum and maximum
values are very easy to locate. The minimum value of a BST will
always be the leftmost node. The maximum value of a BST will
always be the rightmost node. These methods find the leftmost 
and rightmost nodes respectively and print them in a statement.

### Finding the Nth Largest Element

Method Focus: `findNth()` `listInOrder()`

Since BSTs are sorted in such a way where smaller values go
left and larger values go right, when using an inorder traversal
method, the elements are printed out in numerical order
(e.g -5, 1, 2, 59). This method `findingNth()` uses an inOrder
list of values and a variable that represents the largest element 
to search for 

Example: in a list of {2, 4, 6, 8}

- if `placement = 1` the value returned would be 8 
- if `placement = 2` the value returned would be 6
- if `placement = 3` the value returned would be 4

## Tree Manipulation

---

Method Focus: `deleteNode()`

Tree manipulation refers to deleting elements from a BST
and reorganizing the tree to be more efficient. When deleting
a node, the program first searches to see if the element is in
the tree, then proceeds with deletion if the element is found.
the parent of the to be deleted element to recorded. Then in
order for the tree to be most organized after deletion a replacement
node is found by finding the inorder successor of the to be
deleted node. If there is no inorder successor, the inorder
predecessor is used in its place. This replacement node is given
the to be deleted node's children and the parent of the to be
deleted node adopts the replacement node as a child in place.
Finally, the to be deleted node is removed by clearing its
branches with its former children.

## Tree Traversals

---
There are three kinds of traversals for Binary Search Trees:
- Inorder 
- Preorder
- Postorder

### Inorder Traversal

Method Focus: `listInOrder()`

This method returns a list of the values in the tree printed
inorder. Inorder traversal traverses the tree using a Left,
Root, Right methodology. This produces a list that returns
the elements in numerical order for a BST. The method first
travels all the way to the left of the tree. It then checks
for a right child. If there is a child, it moves right and
then repeats, going all the way left and checking for another
right child. If there is no right child, the current node the
method is on is recorded in a list and the method moves up to
the current nodes parent and repeats itself, this time also
checking to make sure it won't add a node that has already been
added.

### Preorder Traversal

Method Focus: `listPreOrder()`

This method returns a list of the values in the tree printed
preorder. Preorder traversal traverses the tree using a Root,
Left, Right methodology. The method firstly records the current
node it is on list. Then its checks if there is a left child.
If there is the method shifts to the left and repeats from the
beginning. Once the method can't move left anymore, the method
begins the travel back up the tree repeating itself with each node
making sure not to include nodes that have already been added to the list.
However, if there is no left child the method shifts to the
right and repeats from the beginning.

### Postorder Traversal

Method Focus: `listPostOrder()`

This method returns a list of the values in the tree printed
postorder. Postorder traversal traverses the tree using a Left,
Right, Root methodology. The method first goes all the way to
the left of the tree, then if there isn't a right child, records
the value to a list. If there is a right child the method moves
right and repeats itself. Once the left most value is added to
the list the method moves up to the parent node and checks for
a right child. If there is one, the method moves lef and repeats
itself, otherwise it adds the parent to the list and continues up.
The method continues checking and adding nodes to the list 
until the root of the tree is added in the list.

## Advanced Searches

---

While a basic searched was demonstrated above with `findElement()`,
in large trees, this type of search could take a long time 
to perform. So the program implements other searches as ways 
to more efficiently search for elements of the tree.

### Depth First Search

Method Focus: `depthFirstSearch()`

This type of search looks at elements toward the bottom of
the tree first. The three traversal methods mentioned above 
are all various ways to perform a depth first search. The method
used in the program involves the use of a postorder traversal
search. The method uses the same logic used to print the tree
in postorder but changes it to be looking for a value and stop
when that value is found, rather than to cycle through all
values in the tree.

### Breadth First Search

Method Focus: `Breadth First Search`

This type of search looks at elements towards the top of the
tree first and proceeds to make its way down the tree. The search
is done similarly to reading a book, left to right, and then top
to bottom. This type of search is most effective for finding 
elements located at the top of a BST. The method first checks the
root of the tree and if it is not the target value, puts its left
and right children in a queue. The method then proceeds to check
first value of the queue and if it is not the target add its left
right children to the end of the queue and delete the first value.
Once the target is found, a statement saying it was found in printed.


package com.spartaglobal.model.BinaryTree;

public class BinaryTree {

    private Node rootNode;
    private int index;
    private int numberOfElements;

    public BinaryTree(){
        rootNode = null;
        numberOfElements = 0;
    }

    public BinaryTree(final int element){
        rootNode = new Node(element);
        numberOfElements = 1;
    }

    public int getRootElement() {
        return rootNode.getValue();
    }

    public Node getRootNode(){
        return rootNode;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void addElement(final int element){
        numberOfElements++;
        if (rootNode == null){
            rootNode = new Node(element);
        }else {
            addNodeToTree(rootNode, element);
        }
    }

    public void addElements(int[] elements) {
        //Iterates over the array of ints and adds them individually
        for (int element: elements) {
            addElement(element);
        }
    }

    public boolean findElement(final int value){
        Node node = findNode(value);
        return node != null;
    }

    //Index for array for sorting the binary tree
    public void resetIndex(){
        index = 0;
    }

    public void incIndex(){
        index++;
    }

    public int getIndex() {
        return index;
    }

    private Node findNode(final int element){
        Node node = rootNode;
        while (node != null){
            //Checks if the element we are looking for is the value of the current node, then it returns it
            if (element == node.getValue()){
                return node;
            }
            //Checks if the element is less than the current node's value, then it traverses to the left node
            // Otherwise, it traverses to the right node
            if (element < node.getValue()){
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        //If the element is not in the binary tree, it returns null
        return null;
    }

    private void addNodeToTree(Node node, final int element){
        //Checks if the element is less than or equal to the current node's value, then examines the left node
        //Otherwise, examines the right node.
        if (element <= node.getValue()){
            //Checks if the left child node is empty, then adds a new node to the left child of the current node
            //Otherwise, traverses to the left node and recurs
            if (node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(),element);
            }
        } else if (element > node.getValue()){
            //Checks if the right child node is empty, then adds a new node to the right child of the current node
            //Otherwise, traverses to the right node and recurs
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(),element);
            }
        }
    }

    public class Node {

        private final int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public boolean isLeftChildEmpty() {
            if (leftChild == null){
                return true;
            }else {
                return false;
            }
        }

        public boolean isRightChildEmpty() {
            if (rightChild == null){
                return true;
            }else {
                return false;
            }
        }

    }

}

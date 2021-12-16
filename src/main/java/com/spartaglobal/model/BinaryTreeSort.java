package com.spartaglobal.model;

import com.spartaglobal.controller.Logging;
import java.util.logging.Level;
import com.spartaglobal.model.BinaryTree.BinaryTree;

public class BinaryTreeSort implements Sortable{

    public int[] sort(int[] arr) {
        Logging.logs(Level.INFO,"Entering BinaryTreeSort.sort");
        //If arr is empty, it just returns the empty array as there is nothing to sort, so it doesn't need to make the binary tree
        if (arr.length == 0){
            return arr;
        }
        //Makes the binary tree
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addElements(arr);
        //Initialises an array with length equal to the number of elements in the binary tree
        int[] sortedArr = new int[binaryTree.getNumberOfElements()];
        //Resets the index to store the elements
        binaryTree.resetIndex();
        return getSortedTreeAsc(binaryTree,binaryTree.getRootNode(),sortedArr);
    }

    private int[] getSortedTreeAsc(BinaryTree binaryTree, BinaryTree.Node node, int[] arr){
        //Checks for left node, then traverses to it and recurs
        if (!node.isLeftChildEmpty()){
            getSortedTreeAsc(binaryTree,node.getLeftChild(),arr);
        }
        //Inserts the value of the node to the array at the current index
        arr[binaryTree.getIndex()] = node.getValue();
        binaryTree.incIndex();
        //Checks for right node, then traverses to it and recurs
        if (!node.isRightChildEmpty()){
            getSortedTreeAsc(binaryTree,node.getRightChild(),arr);
        }
        return arr;
    }

}

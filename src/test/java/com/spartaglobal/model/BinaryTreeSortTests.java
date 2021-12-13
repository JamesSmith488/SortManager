package com.spartaglobal.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinaryTreeSortTests {

    BinaryTreeSort binaryTreeSort = new BinaryTreeSort();

    @Test
    @DisplayName("Testing binary tree sort with an array of 10 elements")
    public void binaryTreeSort10ElementTest(){
        int[] arr = {3, 1, 8, 2, 9, 7, 4, 6, 10, 5};
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, binaryTreeSort.sort(arr));
    }

    @Test
    @DisplayName("Testing binary tree sort with an empty array")
    public void binaryTreeSortEmptyTest(){
        int[] arr = {};
        Assertions.assertArrayEquals(new int[]{}, binaryTreeSort.sort(arr));
    }

}

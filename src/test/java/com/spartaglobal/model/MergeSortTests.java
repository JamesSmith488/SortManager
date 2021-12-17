package com.spartaglobal.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeSortTests {

    MergeSort mergeSort = new MergeSort();

    @Test
    @DisplayName("Testing merge sort with an array of 10 elements")
    public void mergeSort10ElementTest(){
        int[] arr = {3, 1, 8, 2, 9, 7, 4, 6, 10, 5};
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, mergeSort.sort(arr));
    }

    @Test
    @DisplayName("Testing merge sort with an empty array")
    public void mergeSortEmptyTest(){
        int[] arr = {};
        Assertions.assertArrayEquals(new int[]{}, mergeSort.sort(arr));
    }

}

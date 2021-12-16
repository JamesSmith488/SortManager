package com.spartaglobal.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QuickSortTests {

    QuickSort quickSort = new QuickSort();

    @Test
    @DisplayName("Testing quick sort with an array of 10 elements")
    void testingQuickSortWithAnArrayOf10Elements() {
        int[] arr = {3, 1, 8, 2, 9, 7, 4, 6, 10, 5};
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, quickSort.sort(arr));
    }

    @Test
    @DisplayName("Testing quick sort with an empty array")
    void testingQuickSortWithAnEmptyArray() {
        int[] arr = {};
        Assertions.assertArrayEquals(new int[]{}, quickSort.sort(arr));
    }

}

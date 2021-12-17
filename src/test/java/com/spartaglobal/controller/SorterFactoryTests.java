package com.spartaglobal.controller;

import com.spartaglobal.model.BinaryTreeSort;
import com.spartaglobal.model.BubbleSort;
import com.spartaglobal.model.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SorterFactoryTests {

    @Test
    @DisplayName("Testing SorterFactory to return a bubble sort")
    public void bubbleSortFactoryTest(){
        Assertions.assertEquals(BubbleSort.class, SorterFactory.getSorter(1).getClass());
    }

    @Test
    @DisplayName("Testing SorterFactory to return a merge sort")
    public void mergeSortFactoryTest(){
        Assertions.assertEquals(MergeSort.class, SorterFactory.getSorter(2).getClass());
    }

    @Test
    @DisplayName("Testing SorterFactory to return a binary tree sort")
    public void binaryTreeSortFactoryTest(){
        Assertions.assertEquals(BinaryTreeSort.class, SorterFactory.getSorter(3).getClass());
    }

}

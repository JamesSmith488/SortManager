package com.spartaglobal.model;

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

}

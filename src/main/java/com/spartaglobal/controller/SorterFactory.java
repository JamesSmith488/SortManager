package com.spartaglobal.controller;

import com.spartaglobal.model.*;

import java.util.logging.Level;

public class SorterFactory {

    public static Sortable getSorter(int sorter){
        Logging.logs(Level.INFO,"Entering SorterFactory.getSorter");
        Sortable sort;
        if (sorter == 1){
            sort = new BubbleSort();
        } else if (sorter == 2){
            sort = new MergeSort();
        } else if (sorter == 3){
            sort = new BinaryTreeSort();
        } else if (sorter == 4){
            sort = new QuickSort();
        } else {
            sort = null;
        }
        return sort;
    }

}

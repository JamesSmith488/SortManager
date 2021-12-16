package com.spartaglobal.controller;

import com.spartaglobal.model.BinaryTreeSort;
import com.spartaglobal.model.BubbleSort;
import com.spartaglobal.model.MergeSort;
import com.spartaglobal.model.Sortable;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

public class SorterFactory {

    @NotNull
    public static Sortable getSorter(int sorter){
        Logging.logs(Level.INFO,"Entering SorterFactory.getSorter");
        if (sorter == 1){
            return new BubbleSort();
        } else if (sorter == 2){
            return new MergeSort();
        } else if (sorter == 3){
            return new BinaryTreeSort();
        }
        return new BubbleSort();
    }

}

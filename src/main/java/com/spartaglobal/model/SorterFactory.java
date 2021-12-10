package com.spartaglobal.model;

public class SorterFactory {

    public static Sortable getSorter(int sorter){
        if (sorter == 1){
            return new BubbleSort();
        } else if (sorter == 2){
            return new MergeSort();
        }
        return null;
    }

}

package com.spartaglobal.model;

public class SorterFactory {

    public static Sortable getSorter(int sorter){
        if (sorter == 1){
            return new BubbleSort();
        }
        return null;
    }

}

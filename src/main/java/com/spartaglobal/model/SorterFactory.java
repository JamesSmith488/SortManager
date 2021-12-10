package com.spartaglobal.model;

public class SorterFactory {

    public static Sortable getSorter(String sorter){
        if (sorter.equals("Bubble Sort")){
            return new BubbleSort();
        }
        return null;
    }

}

package com.spartaglobal.model;

import com.spartaglobal.controller.Printer;
import java.util.logging.Level;

public class BubbleSort implements Sortable{

    public int[] sort(int[] arr) {
        Printer.getLogger().log(Level.INFO,"Entering BubbleSort.sort");
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        int i = 1;
        int j;
        int element;
        while (i < sortedArr.length) {
            j = i;
            while (j > 0 && sortedArr[j-1] > sortedArr[j]) {
                element = sortedArr[j];
                sortedArr[j] = sortedArr[j-1];
                sortedArr[j-1] = element;
                j--;
            }
            i++;
        }
        return sortedArr;
    }

}

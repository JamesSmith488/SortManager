package com.spartaglobal.model;

import com.spartaglobal.controller.Logging;
import java.util.logging.Level;

public class BubbleSort implements Sortable{

    public int[] sort(int[] arr) {
        Logging.logs(Level.INFO,"Entering BubbleSort.sort");
        //Makes a copy of the inputted array to use for sorting
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        int i = 1;
        int j;
        int element;
        //Performs the bubble sort
        while (i < sortedArr.length) {
            j = i;
            //Stating at index 'j', checks if the element before 'j' is greater and swaps them, 'bubbling' the larger value up to the top of the array
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

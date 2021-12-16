package com.spartaglobal.model;

import com.spartaglobal.controller.Logging;
import java.util.logging.Level;

public class QuickSort implements Sortable{

    @Override
    public int[] sort(int[] arr) {
        Logging.logs(Level.INFO,"Entering QuickSort.sort");
        //Performs a quick sort and returns it
        return quickSort(arr,0,arr.length - 1);
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if (left >= right || left < 0){
            return arr;
        }
        int partition = partition(arr, left, right);
        quickSort(arr, left, partition - 1);
        quickSort(arr, partition + 1, right);
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int index = left - 1;
        for (int j = left; j < right; j++){
            if (arr[j] <= pivot){
                index++;
                int swap = arr[index];
                arr[index] = arr[j];
                arr[j] = swap;
            }
        }
        index++;
        int swap = arr[index];
        arr[index] = arr[right];
        arr[right] = swap;
        return index;
    }

}

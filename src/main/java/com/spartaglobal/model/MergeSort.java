package com.spartaglobal.model;

import com.spartaglobal.controller.Printer;
import java.util.logging.Level;

public class MergeSort implements Sortable{

    @Override
    public int[] sort(int[] arr) {
        Printer.getLogger().log(Level.INFO,"Entering MergeSort.sort");
        return mergeSort(arr,arr.length);
    }

    private static int[] mergeSort(int[] arr, int n){
        if (n < 2){
            return arr;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new  int[n-mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i- mid] = arr[i];
        }
        mergeSort(left,mid);
        mergeSort(right,n - mid);

        return merge(arr,left,right,mid,n-mid);
    }

    private static int[] merge(int[] arr, int[] left, int[] right, int leftEnd, int rightEnd) {
        int i = 0, j = 0, k = 0;
        while (i < leftEnd && j < rightEnd) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while (i < leftEnd) {
            arr[k++] = left[i++];
        }
        while (j < rightEnd) {
            arr[k++] = right[j++];
        }
        return arr;
    }

}

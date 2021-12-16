package com.spartaglobal.model;

import com.spartaglobal.controller.Logging;
import java.util.logging.Level;

public class MergeSort implements Sortable{

    @Override
    public int[] sort(int[] arr) {
        Logging.logs(Level.INFO,"Entering MergeSort.sort");
        //Performs a merge sort and returns it
        return mergeSort(arr,arr.length);
    }

    private static int[] mergeSort(int[] arr, int n){
        //If the array contains less than 2 elements then it returns the array
        if (n < 2){
            return arr;
        }
        //Finds the midpoint of the array and splits it into 2 separate arrays
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new  int[n-mid];
        //Makes a copy of the array into the 2 halves
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }
        //Recursively calls mergeSort to split the array down
        mergeSort(left,mid);
        mergeSort(right,n - mid);
        //Merges the separated arrays together while sorting them
        return merge(arr,left,right,mid,n-mid);
    }

    private static int[] merge(int[] arr, int[] left, int[] right, int leftEnd, int rightEnd) {
        int leftIndex = 0, rightIndex = 0, arrIndex = 0;
        //While both left index and right index are before the end of their respective ends,
        //It checks if the value at left index is less than or equal to the value at right index,
        //Then saves the value at left index to arr, otherwise it saves the value at right index
        while (leftIndex < leftEnd && rightIndex < rightEnd) {
            if (left[leftIndex] <= right[rightIndex]) {
                arr[arrIndex++] = left[leftIndex++];
            }
            else {
                arr[arrIndex++] = right[rightIndex++];
            }
        }
        //If left index is less than its end it fills in the rest of arr with its remaining values
        while (leftIndex < leftEnd) {
            arr[arrIndex++] = left[leftIndex++];
        }
        //If right index is less than its end it fills in the rest of arr with its remaining values
        while (rightIndex < rightEnd) {
            arr[arrIndex++] = right[rightIndex++];
        }
        return arr;
    }

}

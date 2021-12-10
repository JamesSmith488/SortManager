package com.spartaglobal.model;

public class BubbleSort {

    public static int[] sort(int[] arr) {
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

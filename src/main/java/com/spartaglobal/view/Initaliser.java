package com.spartaglobal.view;

import com.spartaglobal.controller.Printer;
import com.spartaglobal.model.SorterFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Initaliser {

    public static void start(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Select a sorting algorithm");
        System.out.println("(1) Bubble Sort");
        System.out.println("(2) Merge Sort");

        int sorter = scanner.nextInt();

        System.out.println("Enter the length of the array");
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            arr[i] = random.nextInt(1001);
        }
        //The unsorted randomly generated array
        System.out.println(Arrays.toString(arr));

        //The sort algorithm to be used
        if (sorter == 1){
            System.out.println("Bubble Sort");
        }else if (sorter == 2){
            System.out.println("Merge Sort");
        }

        Long startTime = System.currentTimeMillis();

        //The sorted array after the algorithm has been executed
        Printer.printArr(SorterFactory.getSorter(sorter).sort(arr));

        Long endTime = System.currentTimeMillis();
        //The time taken
        System.out.println("Sorting took " + (endTime - startTime) + " milliseconds");

    }

}

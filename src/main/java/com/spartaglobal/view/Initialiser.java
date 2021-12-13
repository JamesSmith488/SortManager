package com.spartaglobal.view;

import com.spartaglobal.controller.Printer;
import com.spartaglobal.model.SorterFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Initialiser {

    public static void start(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Select a sorting algorithm");
        System.out.println("(1) Bubble Sort");
        System.out.println("(2) Merge Sort");
        System.out.println("(3) Binary Tree Sort");

        int sorter = scanner.nextInt();

        System.out.println("Enter the length of the array");
        int arrLength = scanner.nextInt();
        if (arrLength < 0){
            System.out.println("Invalid length. Defaulting to 10");
            arrLength = 10;
        }else if (arrLength > 1000){
            System.out.println("Length too high. Defaulting to 100");
        }
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
        }else if (sorter == 3){
            System.out.println("Binary Tree Sort");
        }else {
            System.out.println("Invalid input. Defaulting to Bubble sort");
            sorter = 1;
        }

        Long startTime = System.currentTimeMillis();

        //The sorted array after the algorithm has been executed
        Printer.printArr(SorterFactory.getSorter(sorter).sort(arr));

        Long endTime = System.currentTimeMillis();
        //The time taken
        System.out.println("Sorting took " + (endTime - startTime) + " milliseconds");

    }

}

package com.spartaglobal.view;

import com.spartaglobal.controller.Printer;
import com.spartaglobal.controller.SorterFactory;

public class Initialiser {

    public static void start(){
        Printer.loggerInit();
        int sorter = Printer.sorterSelector();
        int arrLength = Printer.lengthSelector();
        int[] arr = Printer.generateArray(arrLength);
        //The unsorted randomly generated array
        Printer.printArr(arr);
        //The sort algorithm to be used
        Printer.printAlgorithm(sorter);
        //Stores the start time of the sort
        Long startTime = System.currentTimeMillis();
        //The sorted array after the algorithm has been executed
        Printer.printArr(SorterFactory.getSorter(sorter).sort(arr));
        //Stores the end time of the sort
        Long endTime = System.currentTimeMillis();
        //The time taken
        System.out.println("Sorting took " + (endTime - startTime) + " milliseconds");
    }

}

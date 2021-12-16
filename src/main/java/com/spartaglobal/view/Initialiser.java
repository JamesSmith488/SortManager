package com.spartaglobal.view;

import com.spartaglobal.controller.Logging;
import com.spartaglobal.controller.Printer;
import com.spartaglobal.controller.SorterFactory;

public class Initialiser {

    public static void start(){
        //Initialises the logger
        Logging.loggerInit();
        //Prompts the user to select which sorter they want to use
        int sorter = Printer.sorterSelector();
        //Prompts the user to select the length of the array to be sorted
        int arrLength = Printer.lengthSelector();
        //Generates the array randomly
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

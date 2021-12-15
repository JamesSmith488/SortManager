package com.spartaglobal.controller;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;

public class Printer {

    private final static Logger logger = Logger.getLogger("sortLogger");

    public static Logger getLogger(){
        return logger;
    }

    public static void loggerInit(){
        try {
            Handler fileHandler = new FileHandler("src/main/java/com/spartaglobal/view/sortLogger.log");
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static void printArr(int[] arr){
        logger.log(Level.INFO,"Entering Printer.printArr");
        System.out.println(Arrays.toString(arr));
    }

    public static int sorterSelector(){
        logger.log(Level.INFO,"Entering Printer.sortSelector");
        Scanner scanner = new Scanner(System.in);
        int sorter = -1;
        boolean invalid = true;

        while (invalid){
            System.out.println("Select a sorting algorithm");
            System.out.println("(1) Bubble Sort");
            System.out.println("(2) Merge Sort");
            System.out.println("(3) Binary Tree Sort");

            sorter = scanner.nextInt();
            if (sorter < 0 || sorter > 3){
                System.out.println("Invalid input");
            }else {
                invalid = false;
            }
        }
        return sorter;
    }

    public static int lengthSelector(){
        logger.log(Level.INFO,"Entering Printer.lengthSelector");
        Scanner scanner = new Scanner(System.in);
        int arrLength = -1;
        boolean invalid = true;

        while (invalid){
            System.out.println("Enter the length of the array");
            arrLength = scanner.nextInt();
            if (arrLength < 0){
                System.out.println("Invalid length");
            }else if (arrLength > 1000){
                System.out.println("Length too high");
            }else {
                invalid = false;
            }
        }
        scanner.close();
        return arrLength;
    }

    public static int[] generateArray(int arrLength){
        logger.log(Level.INFO,"Entering Printer.generateArray");
        Random random = new Random();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = random.nextInt(1001);
        }
        return arr;
    }

    public static void printAlgorithm(int sorter){
        logger.log(Level.INFO,"Entering Printer.printAlgorithm");
        boolean invalid = true;
        while (invalid){
            invalid = false;
            if (sorter == 1){
                System.out.println("Bubble Sort");
            }else if (sorter == 2){
                System.out.println("Merge Sort");
            }else if (sorter == 3){
                System.out.println("Binary Tree Sort");
            }else {
                System.out.println("Invalid input");
                invalid = true;
            }
        }
    }

}

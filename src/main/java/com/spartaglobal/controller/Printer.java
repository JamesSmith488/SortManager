package com.spartaglobal.controller;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Printer {

    public static void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static int sorterSelector(){
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
        Random random = new Random();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = random.nextInt(1001);
        }
        return arr;
    }

    public static void printAlgorithm(int sorter){
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

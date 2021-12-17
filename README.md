# Sort Manager
The sort manager is a program which provides a range of sorting algorithms to sort a randomly generated array.

# Contents
* [SorterFactory](#SorterFactory)
* [Printer](#Printer)
* [Logging](#Logging)
* [Sortable](#Sortable)
* [Output](#Output)

# SorterFactory 
The SorterFactory class uses a factory design pattern to create the selected sorter to be used. It achieves this through the use of the Sortable interface, so it can return any of the sorters without needing to specify the return type of the specific sorter class being used.

# Printer
The Printer class handles all the printing to the console for the user to see and enter any inputs that the program asks for.

# Logging
The Logging class initialises the logger for the program and has a method for the rest of the program to utilise for logging. The logs method takes 2 parameters a level and a message. 

# Sortable
Sortable is an interface which all the sorters implement. It contains a sort method for the sorters to implement in their own class. The sort method takes a parameter of an unsorted array of ints and returns a sorted array.  

# Output
The output of the program looks like this.
```
Select a sorting algorithm
(1) Bubble Sort
(2) Merge Sort
(3) Binary Tree Sort
(4) Quick Sort
1
Enter the length of the array
10
[86, 904, 754, 356, 812, 634, 863, 874, 861, 415]
Bubble Sort
[86, 356, 415, 634, 754, 812, 861, 863, 874, 904]
Sorting took 3 milliseconds
```
The user will input values for the sorting algorithm they want to select and the length of the array to be randomly generated and sorted.


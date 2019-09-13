# Sorting-Algorithm-Analysis
Java project to sort lists of numbers with varying characteristics and sizes, to compare asymptotic runtime of sorting algorithms.

The most important part of the project is the written analysis in doc/. Please read that document because it has pretty log graphs.

This project compares quicksort, mergesort, insertionsort, selectionsort, heapsort, and radixsort based on time, swaps, and assignments.
From lists of size 4 doubling up to 2^20, the programm uses each algorithm on each of the following: 
an already sorted list, an 80% sorted list, a completely random list, a 20% sorted list, and a reverse sorted list.

Despite most modern sorting algorithms having a runtime complexity of O(N*log(N)), they are not equal.

The console output was produced by my computer over several housrs and is included in doc/.

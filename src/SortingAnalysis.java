/**
 * Jacob Darin Glenny jdg180001
 * CS 3345.501
 * Project 2
 */
import java.util.*;

public class SortingAnalysis {
    private static final Random RAND = new Random(3345501);   //random number generator
    private static long assignments;
    private static long comparisons;
    private static double time;

    public static void main(String[] args) {
        int LENGTH = 4;   //initial length of array to sort
        int RUNS   = 8;   //how many times to double size
        //max size == 4 * 2^18 == 2^20 == 1,048,576 ~~ one million

        

        for(int i = 0; i < RUNS+1; i++) {
            int[] sorted        = createInOrderArray(LENGTH);
            int[] eightySorted  = createMostlySortedArray(LENGTH);
            int[] random        = createRandomArray(LENGTH);
            int[] twentySorted  = createMostlyUnsortedArray(LENGTH);
            int[] reverseSorted = createReverseOrderArray(LENGTH);
            
            
            int[] a = new int[LENGTH];
            long startTime;
            long endTime;
            
            System.out.print("====================");
            System.out.println("\n\n\n\n====================\nARRAY LENGTH " + LENGTH +":\n");
            
            //SORTED ARRAY ANALYSIS
            System.out.print("\nSorted Array");
            System.out.println(Arrays.toString(sorted) + "\n------------------------------------------------------------------");
                System.out.println("\nQuicksort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = sorted.clone();
                    
                    quickSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);
                System.out.println("\nMergesort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = sorted.clone();
                    mergeSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nInsertionsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = sorted.clone();
                    insertionSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nSelectionsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = sorted.clone();
                    selectionSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nHeapsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = sorted.clone();
                    heapSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nRadixsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = sorted.clone();
                    radixSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);
                    
                    
            //EIGHTY PERCENT SORTED ARRAY ANALYSIS
            System.out.print("\nEighty Percent Sorted Array");
            System.out.println(Arrays.toString(eightySorted) + "\n------------------------------------------------------------------");
                System.out.println("\nQuicksort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = eightySorted.clone();
                    quickSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nMergesort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = eightySorted.clone();
                    mergeSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nInsertionsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = eightySorted.clone();
                    insertionSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nSelectionsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = eightySorted.clone();
                    selectionSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nHeapsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = eightySorted.clone();
                    heapSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nRadixsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = eightySorted.clone();
                    radixSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);
                    
                            
            //RANDOM UNSORTED ARRAY ANALYSIS
            System.out.print("\nRandom Array");
            System.out.println(Arrays.toString(random) + "\n------------------------------------------------------------------");
                System.out.println("\nQuicksort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = random.clone();
                    quickSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nMergesort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = random.clone();
                    mergeSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nInsertionsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = random.clone();
                    insertionSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nSelectionsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = random.clone();
                    selectionSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nHeapsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = random.clone();
                    heapSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nRadixsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = random.clone();
                    radixSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);
                    
                            
            //TWENTY PERCENT SORTED ARRAY ANALYSIS
            System.out.print("\nTwenty Percent Sorted Array");
            System.out.println(Arrays.toString(twentySorted) + "\n------------------------------------------------------------------");
                System.out.println("\nQuicksort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = twentySorted.clone();
                    quickSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nMergesort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = twentySorted.clone();
                    mergeSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nInsertionsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = twentySorted.clone();
                    insertionSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nSelectionsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = twentySorted.clone();
                    selectionSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nHeapsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = twentySorted.clone();
                    heapSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nRadixsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = twentySorted.clone();
                    radixSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);
                    
                            
            //REVERSE SORTED ARRAY ANALYSIS
            System.out.print("\nReverse Sorted Array");
            System.out.println(Arrays.toString(reverseSorted) + "\n------------------------------------------------------------------");
                System.out.println("\nQuicksort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = reverseSorted.clone();
                    quickSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nMergesort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = reverseSorted.clone();
                    mergeSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nInsertionsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = reverseSorted.clone();
                    insertionSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nSelectionsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = reverseSorted.clone();
                    selectionSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nHeapsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = reverseSorted.clone();
                    heapSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);

                System.out.println("\nRadixsort");
                    assignments = 0;
                    comparisons = 0;
                    startTime = System.nanoTime();
                    a = reverseSorted.clone();
                    radixSort(a);
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / 1000000000.0;
                    System.out.println("Assignments: " + assignments + ", Comparisons: " + comparisons + ", Time (seconds): " + time);
            
            LENGTH *= 2;   //double size of array for next time
        }
    }

    
    
    
    /*
    Quicksort: in place, divide an array into two partitions: elements 
    greater than the pivot and elements less than or equal to the pivot.
    Place the pivot in the middle, it is now in its sorted position.
    */
    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }
    private static void quickSort(int a[], int min, int max) 
    { 
        comparisons++;
        if (min < max) //base case when this is false
        { 
            int pivotIndex = partition(a, min, max); 
            //a[pivotIndex] is now correct
   
            quickSort(a, min, pivotIndex-1); 
            quickSort(a, pivotIndex+1, max); 
        } 
    } 
    private static int partition(int a[], int min, int max) 
    { 
        int pivot = a[max];  
        int i = (min-1); //index of smaller element 
        for (int current=min; current<max; current++) 
        { 
            comparisons+=2;
            if (a[current] <= pivot) 
            { 
                i++; 
                //swap arr[i] and arr[current] 
                swap(a, i, current);
            } 
        } 
  
        //swap arr[i+1] and pivot(arr[max]), 
        //putting pivot correctly between the two partitions
        swap(a, i+1, max);
  
        return i+1; 
    } 

    
    
    /*
    Mergesort: using auxillary space of O(N), split the array exactly in half.
    COntinue recursively until arrays are size 1. Then merge them linearly.
    */
    public static void mergeSort(int[] a) {
        if(a.length > 1) {
            //split array in half
            int[] left  = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
            assignments += a.length;

            //sort the halves
            mergeSort(left);
            mergeSort(right);

            //merge them back together
            int i1 = 0;
            int i2 = 0;
            for(int i = 0; i < a.length; i++) {
                comparisons++;
                if(i2 >= right.length || (i1 < left.length && left[i1] < right[i2])) {
                    comparisons+=2;
                    assignments++;
                    a[i] = left[i1];
                    i1++;
                } else {
                    assignments++;
                    a[i] = right[i2];
                    i2++;
                }
            }
        }
    }


    /*
    InsertionSort: For each element, iterate over the already sorted
    left side of the array and place the element where it belongs.
    This requires a shift of the sorted partition.
    O(N^2) but O(N) if input is already sorted, because no swaps necessary.
    */
    public static void insertionSort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            comparisons++;
            //a[0]..a[i-1] are sorted,
            //move a[i] into its proper place
            int current = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > current) {
                comparisons++;
                assignments++;
                a[j+1] = a[j];
                j--;
            }
            assignments++;
            a[j+1] = current;
        }
    }

    /*
    SelectionSort: For each element, iterate over the already sorted
    left side of the array and place the element where it belongs.
    This requires a shift of the sorted partition.
    O(N^2) but O(N) if input is already sorted, because no swaps necessary.
    */
    public static void selectionSort(int[] a) {
        for(int pass = 0; pass < a.length; pass++) {
            comparisons++;
            //figure out what should go into a[pass]
            int min = pass;
            for(int j = pass + 1; j < a.length; j++) {
                comparisons++;
                comparisons++;
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, pass, min);
        }
    }


    //Sorts the contents of a using heap sort algorithm.
    public static void heapSort(int[] a) {
        //turn a into a max-heap
        for(int i = a.length / 2; i >= 0; i--) {
            comparisons++;
            percolateDown(a, i, a.length - 1);
        }
        for(int i = a.length - 1; i > 0; i--) {
            comparisons++;
            swap(a, 0, i);			//remove-max, move to end
            percolateDown(a, 0, i - 1);
        }
    }

    //Swaps a[hole] down with its larger child until in place.
    private static void percolateDown(int[] a, int hole, int max) {
        int temp = a[hole];
        while(hole * 2 <= max) {
            comparisons++;
            //pick larger child
            int child = hole * 2;
            comparisons++;
            if(child != max && a[child + 1] > a[child]) {
                child++;
            }
            comparisons++;
            if(a[child] > temp) {
                assignments++;
                a[hole] = a[child];
            } else {
                break;
            }
            hole = child;
        }
        assignments++;
        a[hole] = temp;
    }

    //Arranges the elements in the array into ascending order
    //using the "radix sort" algorithm, which sorts into ten
    //queues by ones digit, then tens, ... until sorted.
    //@SuppressWarnings("unchecked")
    public static void radixSort(int[] a) {
        //initialize array of 10 queues for digit value 0-9
        Queue<Integer>[] buckets = (Queue<Integer>[]) new Queue[10];
        for(int i = 0; i < buckets.length; i++) {
            assignments++;
            buckets[i] = new ArrayDeque<Integer>();
        }

        //copy to/from buckets repeatedly until sorted
        int digit = 1;
        while(toBuckets(a, digit, buckets)) {
            comparisons++;
            fromBuckets(a, buckets);
            digit++;
        }
    }
    //Organizes the integers in the array into the given array
    //of queues based on their digit at the given place.
    //For example, if digit == 2, uses the tens digit, so array
    //{343, 219, 841, 295} would be put in queues #4, 1, 4, 9.
    //Returns true if any elements have a non-zero digit value.
    private static boolean toBuckets(int[] a, int digit, Queue<Integer>[] buckets) {
        boolean nonZero = false;
        for(int element : a) {
            int which = kthDigit(element, digit);
            buckets[which].add(element);
            assignments++; //add
            comparisons++; //if
            if(which != 0) {
                nonZero = true;
            }
        }
        return nonZero;
    }
    //Returns the k'th least significant digit from the given integer.
    //For example, kthDigit(9814728, 3) returns 7.
    //If the given integer does not have a kth digit, returns 0.
    private static final int kthDigit(int element, int k) {
        for(int i = 1; i <= k - 1; i++) {
            comparisons++;
            element = element / 10;
        }
        return element % 10;
    }
    //Moves the data in the given array of queues back into the 
    //given array, in ascending order by bucket.
    //Postcondition: all queues in the array are empty.
    private static void fromBuckets(int[] a, Queue<Integer>[] buckets) {
        int i = 0;
        for(int j = 0; j < buckets.length; j++) {
            comparisons++;
            while(!buckets[j].isEmpty()) {
                comparisons++;
                a[i] = buckets[j].remove();
                assignments++;
                i++;
            }
        }
    }

    
    //swap
    private static void swap(int[] a, int i, int j) {
        if(i != j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        assignments+=3;
    }

    //boolean = (sorted in ascending order?)
    private static boolean isSorted(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i+1] < a[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] createInOrderArray(int length) {
        int[] a = new int[length];
        for(int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        return a;
    }

    public static int[] createReverseOrderArray(int length) {
        int[] a = new int[length];
        for(int i = 0; i < a.length; i++) {
            a[i] = a.length - 1 - i;
        }
        return a;
    }
    
    public static int[] createRandomArray(int length) {
        int[] a = new int[length];
        for(int i = 0; i < a.length; i++) {
            //a[i] = RAND.nextInt(1000000);
            a[i] = RAND.nextInt(a.length);
        }
        return a;
    }
    
    //The first 80% of the array is inorder, the last 20% is random
    public static int[] createMostlySortedArray(int length) {
        int[] a = new int[length];
        for(int i = 0; i < a.length; i++) {
            
            if((100*i)/a.length >= 80) {
                a[i] = RAND.nextInt(a.length - i) + i;
                //a[i] = RAND.nextInt(a.length);
            }
            else {
                a[i] = i;
            }
        }
        return a;
    }
    
    //The first 20% of the array is inorder, the last 80% is random
    public static int[] createMostlyUnsortedArray(int length) {
        int[] a = new int[length];
        for(int i = 0; i < a.length; i++) {
            
            if((100*i)/a.length >= 20) {
                a[i] = RAND.nextInt(a.length - i) + i;
                //a[i] = RAND.nextInt(a.length);
            }
            else {
                a[i] = i;
            }
        }
        return a;
    }
    
}
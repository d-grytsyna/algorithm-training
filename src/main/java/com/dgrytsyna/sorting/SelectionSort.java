package com.dgrytsyna.sorting;

public class SelectionSort {

    public static <T extends Comparable<T>> void sort(T[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            T smallest = array[i];
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(smallest) < 0) {
                    smallest = array[j];
                    smallestIndex = j;
                }
            }
            swap(array, i, smallestIndex);
        }

    }

    private static <T extends Comparable<T>> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

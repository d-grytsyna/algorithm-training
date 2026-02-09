package com.dgrytsyna.binary_search;

public class RecursiveBinarySearch {

    public static <T extends Comparable<T>> int recursiveBinarySearch(T[] array, T key, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid].compareTo(key) == 0) return mid;
            if (array[mid].compareTo(key) > 0) return recursiveBinarySearch(array, key, low, mid - 1);
            else return recursiveBinarySearch(array, key, mid + 1, high);
        }
        return -1;
    }
}

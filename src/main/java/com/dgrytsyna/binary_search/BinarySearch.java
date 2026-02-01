package com.dgrytsyna.binary_search;

public class BinarySearch {
    public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            T guess = array[mid];
            if (guess.compareTo(key) == 0) return mid;
            if (guess.compareTo(key) > 0) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}

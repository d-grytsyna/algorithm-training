package com.dgrytsyna.recursive;

import java.util.Arrays;
import java.util.Collection;

public class RecursiveMax {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array.length <= 1) {
            return array[0];
        }
        if (array.length == 2) {
            return  (array[0].compareTo(array[1]) > 0) ? array[0] : array[1];
        }
        T[] leftArray = Arrays.copyOfRange(array, 0, array.length / 2);
        T[] rightArray = Arrays.copyOfRange(array, array.length / 2, array.length);
        T left = findMax(leftArray);
        T right = findMax(rightArray);
        return left.compareTo(right) > 0 ? left : right;
    }
}

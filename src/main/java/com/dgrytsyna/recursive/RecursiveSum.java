package com.dgrytsyna.recursive;

public class RecursiveSum {

    public static int sumOfNumbers(int n) {
        if (n < 10) return n;
        return sumOfNumbers(n / 10) + n % 10;
    }
}

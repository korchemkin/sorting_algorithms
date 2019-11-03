package com.github.korchemkin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] unsortedArr = {5, 8, 1, 3, 9, 6};

        InsertionSort insertionSort = new InsertionSort();
        int[] insertionSortResult = insertionSort.sort(unsortedArr);

        Arrays.sort(unsortedArr);
        System.out.println("InsertionSort " + Arrays.equals(unsortedArr, insertionSortResult));
    }
}

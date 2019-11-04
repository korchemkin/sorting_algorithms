package com.github.korchemkin;

import java.util.Arrays;

public class Sorter {

    private int[] copy(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public int[] insertionSort(int[] arr) {
        int[] result = copy(arr);
        int temp;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - 1; j++) {
                if (result[j] > result[j + 1]) {
                    temp = result[j + 1];
                    result[j + 1] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;
    }

    public int[] selectionSort(int[] arr) {
        int[] result = copy(arr);
        int temp;
        int minVal;
        int minValIndex;

        for (int i = 0; i < result.length; i++) {
            minVal = result[i];
            minValIndex = i;

            for (int j = i; j < result.length; j++) {
                if (result[j] < minVal) {
                    minVal = result[j];
                    minValIndex = j;
                }
            }

            if (minVal < result[i]) {
                temp = result[i];
                result[i] = result[minValIndex];
                result[minValIndex] = temp;
            }
        }

        return result;
    }
}

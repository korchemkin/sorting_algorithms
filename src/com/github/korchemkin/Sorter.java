package com.github.korchemkin;

import java.util.Arrays;

public class Sorter {
    private int[] copy(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public int[] insertionSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int[] result = copy(arr);
        int temp;
        int i;
        int j;

        for (i = 0; i < result.length; i++) {
            for (j = 0; j < result.length - 1; j++) {
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
        if (arr.length < 2) {
            return arr;
        }

        int[] result = copy(arr);
        int temp;
        int i;
        int j;
        int minVal;
        int minValIndex;

        for (i = 0; i < result.length; i++) {
            minVal = result[i];
            minValIndex = i;

            for (j = i; j < result.length; j++) {
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

    public int[] bubbleSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int[] result = copy(arr);
        int temp;
        int i;
        int j;

        int len = result.length - 1;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len - i; j++) {
                if (result[j] > result[j + 1]) {
                    temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }

    public int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int[] result = copy(arr);
        MergeSorter mergeSorter = new MergeSorter();
        mergeSorter.sort(result, 0, result.length - 1);
        return result;
    }

    public int[] quickSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int[] result = copy(arr);
        QuickSort quickSort = new QuickSort();
        quickSort.sort(result);
        return result;
    }
}

package com.github.korchemkin;

import java.util.Arrays;

public class InsertionSort {
    int[] sort(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
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
}

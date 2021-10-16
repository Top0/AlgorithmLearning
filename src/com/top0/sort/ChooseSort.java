package com.top0.sort;

/**
 * 选择排序：不断的从剩余数组中选择最大或者最小的数，完成整个排序
 * 时间负责度：O(n^2)
 */
public class ChooseSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 6, 7, 9, 1, 3};
        chooseSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void chooseSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // 假设当前数为最小值
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                // 如果存在比它还小的数，那么取该数
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // 当前数不是最小数
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }

    // 利用异或特性， A^A=0   B^0=B
    private static void swap(int[] array, int i, int minIndex) {
        array[i] = array[i] ^ array[minIndex];
        array[minIndex] = array[i] ^ array[minIndex];
        array[i] = array[i] ^ array[minIndex];
    }
}

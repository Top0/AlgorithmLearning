package com.top0.sort;

/**
 * 快速排序: 选择一个基准值，将大于该值的和小于该值的放到两个子串中，子串继续排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 6, 7, 9, 1, 3};
        sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void sort(int[] array) {
        int baseNumIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[baseNumIndex]) {
                //swap(array,i,baseNumIndex);
            }
        }
    }

}

package com.top0.sort.归并排序;

/**
 * 归并排序：数组从中间拆分为两组，分别排好序后，合并这两个有序数组
 * 递归+合并
 * 时间复杂度：O(n*logn)
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 6, 7, 9, 1, 3};

        int left = 0;
        int right = array.length - 1;

        process(array, left, right);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void process(int[] array, int left, int right) {
        if (left == right) {
            return;
        }
        // 不使用 (right+left)>>1 的原因是，防止越界！
        int mid = left + ((right - left) >> 1);
        process(array, left, mid);
        process(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] help = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        //合并left-mid  mid+1-right 两个数组，谁小取谁，并且p右移
        while (p1 <= mid && p2 <= right) {
            help[i++] = array[p1] < array[p2] ? array[p1++] : array[p2++];
        }
        while (p1 <= mid) {
            help[i++] = array[p1++];
        }
        while (p2 <= right) {
            help[i++] = array[p2++];
        }
        // 将排好序的临时数据put到原数组中
        for (int j = 0; j < help.length; j++) {
            array[left + j] = help[j];
        }
    }
}

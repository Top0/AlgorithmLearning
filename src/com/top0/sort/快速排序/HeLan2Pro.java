package com.top0.sort.快速排序;

/**
 * 荷兰国旗问题：含等于判断
 * 给定一个数组arr和一个数num，请把小于num的数放在数组的左边，
 * 等于num的数放在数组的中间，大于num的数放在数组的右边。
 * 要求额外空间复杂度为O(1)，时间复杂度为O(N)
 */
public class HeLan2Pro {
    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 5, 6, 7, 5, 9, 1, 3};
        int num = 5;
        slove(array, num);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void slove(int[] array, int num) {
        int lowIndex = -1;
        int hignIndex = array.length;
        for (int i = 0; i < hignIndex & i > lowIndex; i++) {
            if (array[i] < num) {
                swap(array, i, ++lowIndex);
            } else if (array[i] > num) {
                swap(array, i, --hignIndex);
                i--;
            }
        }
    }

    private static void swap(int[] array, int i, int i1) {
        if (i == i1) {
            return;
        }
        array[i] = array[i] ^ array[i1];
        array[i1] = array[i] ^ array[i1];
        array[i] = array[i] ^ array[i1];
    }
}

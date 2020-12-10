package com.example.myapplication.testexample;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 说明：
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例：
 * 输入：
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * 输出：[1,2,2,3,5,6]
 * 提示：
 * -10^9 <= nums1[i], nums2[i] <= 10^9
 * nums1.length == m + n
 * nums2.length == n
 */
public class MergeDemo {
    /**
     * 方法一
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    /**
     * 方法二
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num1copy = new int[m];
        System.arraycopy(nums1, 0, num1copy, 0, m);
        int p = m - 1;
        int p2 = n - 1;
        int p1 = m + n - 1;
        while (p >= 0 && p2 >= 0) {
            if (num1copy[p] > nums2[p2]) {
                nums1[p1] = num1copy[p];
                p1--;
                p--;
            } else if (num1copy[p] < nums2[p2]) {
                nums1[p1] = nums2[p2];
                p1--;
                p2--;
            } else {
                nums1[p1] = num1copy[p];
                nums1[p1 - 1] = nums2[p2];
                p1 = p1 - 2;
                p--;
                p2--;
            }
        }
        if (p >= 0) {
            System.arraycopy(num1copy, 0, nums1, 0, p + 1);
        } else if (p2 >= 0) {
            System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
        }
    }
}

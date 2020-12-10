package com.example.myapplication.testexample;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class MaxSubArrayDemo {
    /**
     * 贪心法
     * 当前所指元素之前的和小于0，则丢弃当前元素之前的数列，从后一个元素重新计算
     * @param nums
     * @return
     */
    public int maxSubArray1(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int x : nums) {
            if (sum <= 0) {
                sum = x;
            } else {
                sum += x;
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }

}

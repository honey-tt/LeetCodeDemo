package com.example.myapplication.testexample;

import java.util.Arrays;

/**
 * 136. 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * <p>
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class SingleNumberDemo {
    /**
     * 方法一
     * 首先进行排序，在排好序的数组进行查找
     *
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        int pre = 0;
        int next = 1;
        while (pre < next && next < nums.length - 1) {
            if (nums[pre] == nums[next]) {
                pre += 2;
                next += 2;
            } else {
                return nums[pre];
            }
        }
        return nums[pre];
    }

    /**
     * 利用异或运算
     * 与0异或结果为本身
     * 与本身异或结果为0
     * 多个数进行异或运算满足交换律和结合律
     *
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans^=num;
        }
        return ans;
    }
}

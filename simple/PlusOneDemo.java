package com.example.myapplication.testexample;

/**
 * 66. 加一
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 示例 1：
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * <p>
 * 示例 2：
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * <p>
 * 示例 3：
 * 输入：digits = [0]
 * 输出：[1]
 * 提示：
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 */
public class PlusOneDemo {
    /**
     * 方法一：暴力破解
     *
     * @param digits
     * @return
     */
    public int[] plusOne1(int[] digits) {
        int length = digits.length;
        if (1 == length && 9 == digits[0]) {
            int[] digitsExtension = new int[length + 1];
            digitsExtension[1] = 0;
            digitsExtension[0] = 1;
            return digitsExtension;
        }
        if (9 == digits[length - 1]) {
            digits[length - 1] = 0;
            for (int i = length - 2; i >= 0; i--) {
                if (9 == digits[i]) {
                    digits[i] = 0;
                } else {
                    digits[i] += 1;
                    break;
                }
            }
            if (0 == digits[0]) {
                int[] digitsExtension = new int[length + 1];
                System.arraycopy(digits, 0, digitsExtension, 1, length);
                digitsExtension[0] = 1;
                return digitsExtension;
            }
        } else {
            digits[length - 1] += 1;
        }
        return digits;
    }

    /**
     * 方法二：利用取余运算符
     *
     * @param digits
     * @return
     */
    public int[] plusOne2(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            digits[i] += 1;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        if (0 == digits[0]) {
            int[] digitsExtension = new int[length + 1];
            System.arraycopy(digits, 0, digitsExtension, 1, length);
            digitsExtension[0] = 1;
            return digitsExtension;
        }
        return digits;
    }
}

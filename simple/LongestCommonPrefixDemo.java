package com.example.myapplication.testexample;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 */
public class LongestCommonPrefixDemo {
    /**
     *解题思路
     *首先判断输入的字符串数组是否为空&&长度是否为空&&第一个字符串是否为空字符串
     *接着判断输入的字符串数组的长度为1，若为1，原样输出即可
     *排除特殊情况后，正常的情况将字符串数组的第一个值作为比较基准值，使用charAt函数返回指定索引处的字符
     *比较后将相等部分赋值给seq，继续与下一个值进行比较，依次递推
     */
    public String longestCommonPrefix(String[] strs) {
        if(null==strs||0==strs.length||"".equals(strs[0])){
            return "";
        }
        if(1==strs.length){
            return strs[0];
        }
        String seq=strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            for(;j<seq.length()&&j<strs[i].length();j++){
                if(seq.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            seq=seq.substring(0,j);
        }

        return seq;
    }
}

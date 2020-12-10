package com.example.myapplication.testexample;

public class TwoSumDemo {
    int sums[]=new int[2];
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                int sum=nums[i]+nums[j];
                if(target==sum){
                    sums[0]=i;
                    sums[1]=j;
                    return sums;
                }
            }
        }
        return sums;
    }
}

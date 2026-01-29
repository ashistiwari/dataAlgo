package com.dataAlgo.dataAlgo.array;

public class MaximumSumSubarray {
    public int maxSumSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxsofar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum=0;
            }
            currentSum=currentSum+nums[i];
            if (currentSum > maxsofar) {
                maxsofar=currentSum;
            }
        }
        return maxsofar;
    }

}

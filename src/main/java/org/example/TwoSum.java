package org.example;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] testArray = {2, 15, 17, 20};
        int target = 37;
        int[] sum = twoSum(testArray, target);

    }

    public static int[] twoSum(int[] nums, int target) {
        int x = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentSum = nums[i] + nums[i + 1];
            if (currentSum == target) {
                return new int[]{i, i + 1};
            }
            currentSum += nums[i + 2] - x;
            x = nums[i];
        }

        /*
        for(int i = 0; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length; j ++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        */
        return new int[]{};
    }
}


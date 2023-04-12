package com.java.leetcodde;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int count = 0 ;
        for(int i = 0; i <= nums.length-1; i++){
            if(nums[i] < target ){
                count++;
            }
        }
        return count;
    }
}

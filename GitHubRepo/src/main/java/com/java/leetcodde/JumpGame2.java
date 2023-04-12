package com.java.leetcodde;

public class JumpGame2 {
    public int jump(int[] nums) {
        int currStart = 0;
        int currReach = 0;
        int jumps = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(i+nums[i]>currReach){
                currReach = i+nums[i];

            }
            if(i == currStart){
                jumps++;
                currStart = currReach;
            }
}

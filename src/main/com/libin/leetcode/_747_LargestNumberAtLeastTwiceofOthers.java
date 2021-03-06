package libin.leetcode;

/**
 * Copyright (c) 2019/04/02. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose : 查找数组中最大元素是否至少是数组中每个其它元素的两倍
 */
public class _747_LargestNumberAtLeastTwiceofOthers {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sec = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                sec = max;
                max = nums[i];
                index = i;
            }else{
                if (nums[i] > sec) sec = nums[i];
            }
        }
        if (max >= sec * 2) return index;
        return -1;
    }
}

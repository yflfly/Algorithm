package libin.leetcode_cn_algorithm;

import java.util.LinkedList;

/**
 * Copyright (c) 2020/4/11. libin Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :    3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class _3_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        LinkedList<Character> queue = new LinkedList<Character>();  // 移动窗口
        int maxLen = 1;
        char[] chars = s.toCharArray();
        queue.addLast(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            while (queue.contains(chars[i])) {  // 发现有重复的数字，把之前重复的数字全部去掉
                queue.removeFirst();
            }
            queue.addLast(chars[i]);
            if (queue.size() > maxLen) {
                maxLen = queue.size();
            }
        }
        return maxLen;
    }
}
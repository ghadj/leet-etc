/**
 * ---
 * [https://leetcode.com/problems/max-number-of-k-sum-pairs]
 * 1679. Max Number of K-Sum Pairs
 * You are given an integer array nums and an integer k.
 *
 * In one operation, you can pick two numbers from the array whose sum equals k
 * and remove them from the array.
 *
 * Return the maximum number of operations you can perform on the array.
 * ---
 */
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int p1 = 0, p2 = nums.length - 1, count = 0;

        while (p1 < p2) {
            int sum = nums[p1] + nums[p2];
            if (sum == k) {
                count++;
                p1++;
                p2--;
            } else if (sum < k) 
                p1++;
            else 
                p2--;
        }
        return count;
    }
}
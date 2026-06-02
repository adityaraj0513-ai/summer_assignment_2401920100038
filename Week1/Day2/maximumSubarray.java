class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int el : nums) {
            if (currSum < 0) {
                currSum = 0;
            }
            currSum += el;
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;

    }
}
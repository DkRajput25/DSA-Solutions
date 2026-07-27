1class Solution {
2    public int maxProduct(int[] nums) {
3        int n = nums.length-1;
4        Arrays.sort(nums);
5        return (nums[n]-1)*(nums[n-1]-1);
6    }
7}
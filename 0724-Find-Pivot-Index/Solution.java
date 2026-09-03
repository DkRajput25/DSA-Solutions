1class Solution {
2    public int pivotIndex(int[] nums) {
3        int totalsum = 0;
4        int leftsum = 0;
5        int rightsum = 0;
6        for(int n:nums){
7            totalsum = totalsum + n;
8        }
9        for(int i = 0;i<=nums.length-1;i++){
10            rightsum = totalsum - leftsum - nums[i];
11            if(leftsum==rightsum){
12                return i;
13            }
14            else{
15                leftsum = leftsum+nums[i];
16            }
17        }
18
19        return -1;
20    }
21}
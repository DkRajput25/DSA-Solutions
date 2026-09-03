1class Solution {
2    public int findMiddleIndex(int[] nums) {
3        int totalsum = 0;
4        int rightsum = 0;
5        int leftsum = 0;
6        for(int n: nums){
7            totalsum+=n;
8        }
9        for(int i=0;i<=nums.length-1;i++){
10            rightsum = totalsum - leftsum - nums[i];
11
12            if(leftsum==rightsum){
13                return i;
14            }
15            else{
16                leftsum +=nums[i];
17            }
18        }
19        return -1;
20    }
21}
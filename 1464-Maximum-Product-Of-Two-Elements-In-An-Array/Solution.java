1class Solution {
2    public int maxProduct(int[] nums) {
3        // int n = nums.length-1;
4        // Arrays.sort(nums);
5        // return (nums[n]-1)*(nums[n-1]-1);
6
7
8        int m =0;
9        int n=0;
10        for(int num : nums){
11            if(num>m){
12                n=m;
13                m=num;
14            }
15            else if(num>n){
16                n = num;
17            }
18        }
19        return (n-1)*(m-1);
20    }
21}
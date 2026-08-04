1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        Arrays.sort(nums);
4        List<Integer> l = new ArrayList<>();
5        int n = nums.length-1;
6        int start = nums[0];
7        int end = nums[n];
8        int i=0;
9        while(start<=end){
10            if(nums[i]!=start){
11                l.add(start);
12                start++;
13            }else{
14
15            i++;
16            start++;
17            } 
18        }
19        return l;
20    }
21}
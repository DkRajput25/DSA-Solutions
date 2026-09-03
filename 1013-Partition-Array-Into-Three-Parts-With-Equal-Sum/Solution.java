1class Solution {
2    public boolean canThreePartsEqualSum(int[] arr) {
3        int totalsum = 0;
4        int sum =0;
5        int count = 0;
6        for(int n: arr){
7            totalsum+=n;
8        }
9        if(totalsum%3!=0){
10            return false;
11        }
12        
13        int target = totalsum/3;
14
15        for(int i=0;i<arr.length;i++){
16            sum += arr[i];
17
18            if(sum==target){
19                count++;
20                sum=0;
21
22                if(count==2){
23                    return true;
24                }
25            }
26        }
27        
28
29        return false;
30    }
31}
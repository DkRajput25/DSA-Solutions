1class Solution {
2    public boolean canThreePartsEqualSum(int[] arr) {
3        int totalsum = 0;
4        int first = 0;
5        int second = 0;
6        int target=0;
7        for(int n: arr){
8            totalsum+=n;
9        }
10        if(totalsum%3==0){
11            target = totalsum/3;
12        }
13        else{
14            return false;
15        }
16
17        for(int i=0;i<arr.length;i++){
18            if(first!=target){
19                first +=arr[i]; 
20            }
21            else if(first == target){
22                if(second!=target){
23
24                second+=arr[i];
25                }
26            }
27        }
28        if(first==second){
29            return true;
30        }
31
32        return false;
33    }
34}
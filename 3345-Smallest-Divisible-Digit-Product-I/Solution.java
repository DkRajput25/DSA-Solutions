1class Solution {
2    public int smallestNumber(int n, int t) {
3        for(int i = n; ;i++){
4            int p = 1;
5            int num = i;
6            while(num>0){
7                p *= (num%10);
8                num/=10;
9            }
10            if(p%t==0){
11                return i;
12            }
13        }
14        
15    }
16}
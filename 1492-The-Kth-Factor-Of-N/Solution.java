1class Solution {
2    public int kthFactor(int n, int k) {
3        List<Integer> list = new ArrayList<>();
4
5        for(int i = 1; i <= n; i++) {
6            if(n % i == 0) {
7                list.add(i);
8            }
9        }
10
11        if(k<= list.size()){
12            return list.get(k-1);
13        }
14
15        return -1;
16    }
17}
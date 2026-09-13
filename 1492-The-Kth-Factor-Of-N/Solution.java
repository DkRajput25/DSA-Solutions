class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if(n%i==0){
                list.add(i) ;
            if(i != n/i)list.add(n/i);
            }
        }
        Collections.sort(list) ;
        if(k>list.size())return -1 ;
        return list.get(k-1) ;
    }
}
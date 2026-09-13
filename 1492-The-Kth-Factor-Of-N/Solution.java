class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer>list=new ArrayList();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
            } 
        }
        for(int i=(int)Math.sqrt(n);i>1;i--){
            if(n%i==0){
                if(i!=n/i){
                    list.add(n/i);
                }
            } 
        }list.add(n);
        System.out.print(list);
        if(k<=list.size()){
            return list.get(k-1);
        }
        return -1;
    }
}
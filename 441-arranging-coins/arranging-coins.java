class Solution {
    public int arrangeCoins(int n) {
        int l=1;
        int h=n;
        
        while(l<=h){
            int m=l+(h-l)/2;
            long k=(long)m*(m+1)/2;
            if(k<=n){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return h;
    }
}
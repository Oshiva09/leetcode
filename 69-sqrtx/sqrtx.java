class Solution {
    public int mySqrt(int x) {
        int l=1;
        int h=x/2;
        int ans=0;
        if(x==1) return 1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(m==x/m){
                return m;
            }
            else if(m<x/m){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return h;
    }
}
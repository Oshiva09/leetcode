class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        for(int i=0;i<n;i++){
            c+=m-bs(grid[i],0,m-1);

        }
        return c;
    }
    public int bs(int[] a, int l,int h){
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]>=0){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return l;
    }
}
class Solution {
    public int minElement(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int r=0;
            while(n>0){
            r=r+(n%10);
            n/=10;
            }
            m=Math.min(r,m);
            
        }
        return m;
    }
}
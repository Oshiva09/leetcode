class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[l]<=nums[m]){
                ans=Math.min(ans,nums[l]);
                l=m+1;
            }else {
                h=m-1;
                ans=Math.min(ans,nums[m]);
            }
        }
        return ans;
    }
}
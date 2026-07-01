class Solution {
    public int mostFrequentEven(int[] nums) {
        int maxfreq=0;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0)
            continue;
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    c++;
                }

            }
            if(c>maxfreq){
                maxfreq=c;
                ans=nums[i];
            }else if(c==maxfreq && nums[i]<ans){
                ans=nums[i];
            }
        }
        return ans;
    }
}
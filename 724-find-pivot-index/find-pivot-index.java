class Solution {
    public int pivotIndex(int[] nums) {
        int tsum = Arrays.stream(nums).sum();
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            if(sum-nums[i] == tsum-sum){
                return i;
            }
        }
        return -1;
    }
}
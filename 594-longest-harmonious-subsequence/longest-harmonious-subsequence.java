class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int m=0;
        int j=1;
        while(j<nums.length && nums[i]==nums[j]){
            j++;
        }
        while(j<nums.length){
            while(j<nums.length-1 && nums[j]==nums[j+1]){
            j++;
        }
        if(nums[j]-nums[i] == 1)m=Math.max(m,j-i+1);
        while(nums[i]==nums[i+1]){
            i++;
        }
        i++;
        j++;
        }
        return m;
    }
}
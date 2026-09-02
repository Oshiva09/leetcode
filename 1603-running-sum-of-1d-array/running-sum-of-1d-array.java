class Solution {
    public int[] runningSum(int[] nums) {
        int c=0;
        int[] arr=new int[nums.length];
        arr[0]=nums[0];
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            arr[c++]=s;

        }
        return arr;

        
    }
}
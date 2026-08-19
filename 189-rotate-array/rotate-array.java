class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k%n;
            reve(nums,0,n-1);
            reve(nums, 0,k-1);
            reve(nums, k,n-1);

        
    }
    public void reve(int[] nums, int low, int high){
        int temp=0;
        while(low<high){
        temp=nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
        low++;
        high--;
        }
        
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int z=0;
        int t=n-1;
        int i=0;
        while(i<=t){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[z];
                nums[z]=temp;
                z++;
                i++;


            }
            else if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[t];
                nums[t]=temp;
                t--;
            }
            else{
                i++;
            }

        }
    }
}
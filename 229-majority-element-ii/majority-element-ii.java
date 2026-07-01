class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        if(ans.contains(nums[i]))
            continue;
            int c=0;    
        for(int j=0;j<nums.length;j++){
            if(nums[j]==nums[i]){
                c++;
            }
        }
        if(c>nums.length/3){
            ans.add(nums[i]);
        }
        }
        return ans;
        
    }
}
class Solution {

    public int[] sortedSquares(int[] nums) {
        int c = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[c++] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        for (int k = 0; k < nums.length; k++) {
            nums[k]=arr[k];
        }
        return nums;
    }
}
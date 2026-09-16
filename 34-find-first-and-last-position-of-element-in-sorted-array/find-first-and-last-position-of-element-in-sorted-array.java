class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findBound(nums, target, true);   // Find first occurrence
        result[1] = findBound(nums, target, false);  // Find last occurrence
        return result;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int l = 0;
        int h = nums.length - 1;
        int bound = -1;

        while (l <= h) {
            int m = l + (h - l) / 2;

            if (nums[m] == target) {
                bound = m;
                if (isFirst) {
                    h = m - 1; // Keep searching left to find first occurrence
                } else {
                    l = m + 1; // Keep searching right to find last occurrence
                }
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        return bound;
    }
}
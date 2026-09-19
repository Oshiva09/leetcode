class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int ans = Integer.MAX_VALUE;

        if (n == 1)
            return nums[0];

        while (l <= h) {
            int m = l + (h - l) / 2;

            // Duplicate case
            if (nums[l] == nums[m] && nums[m] == nums[h]) {
                ans = Math.min(ans, nums[l]);  // CHANGE
                l++;
                h--;
                continue;
            }

            if (nums[l] <= nums[m]) {
                ans = Math.min(ans, nums[l]);
                l = m + 1;
            } else {
                ans = Math.min(ans, nums[m]);
                h = m - 1;
            }
        }

        return ans;
    }
}
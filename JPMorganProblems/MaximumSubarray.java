class Solution {
  public int maxSubArray(int[] nums) {
      if (nums.length == 0) return 0;

      int curr_total = nums[0];
      int max_total = nums[0];

      for (int i = 1; i < nums.length; i++) {
          curr_total = Math.max(nums[i], curr_total + nums[i]);
          max_total = Math.max(max_total, curr_total);
      }
      return max_total;
  }
}


// set curr and return value to first value
// iterate and compare if current iteration increases curr or return value.
bv
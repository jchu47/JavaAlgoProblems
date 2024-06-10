class Solution {
  public int[] twoSum(int[] nums, int target) {

      if (nums.length == 0) {
          throw new IllegalArgumentException("No two sum solution");
      }

      HashMap<Integer, Integer> map = new HashMap<>();

      map.put(nums[0], 0);
      for (int i = 1; i < nums.length; i++) {
          int ref = target - nums[i];
          if (map.containsKey(ref)) {
              return new int[] { map.get(ref), i };
          } else {
              map.put(nums[i], i);
          }
      }
      throw new IllegalArgumentException("No two sum solution");
  }
}

// Note the return values and error handling. 
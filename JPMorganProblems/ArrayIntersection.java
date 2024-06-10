class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
      // Create HashSet from nums1
      Set<Integer> seen1 = new HashSet<Integer>();
      for (int num : nums1) {
          seen1.add(num);
      }

      // Create HashSet from nums2
      Set<Integer> seen2 = new HashSet<Integer>();
      for (int num : nums2) {
          seen2.add(num);
      }

      // Retain only the elements that are contained in seen2
      seen1.retainAll(seen2);

      // Convert the set to an array
      int[] result = new int[seen1.size()];
      int i = 0;
      for (int num : seen1) {
          result[i++] = num;
      }

      return result;
  }
}

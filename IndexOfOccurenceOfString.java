class Solution {
  public int strStr(String haystack, String needle) {
      if (needle.length() == 0) return 0; // If needle is empty, return 0
      if (haystack.length() < needle.length()) return -1;

      char[] word = haystack.toCharArray();
      char[] lookup = needle.toCharArray();

      for (int i = 0; i <= word.length - lookup.length; i++) {
          if (word[i] == lookup[0]) {
              int k;
              for (k = 1; k < lookup.length; k++) {
                  if (word[i + k] != lookup[k]) break;
              }
              if (k == lookup.length) return i; // All characters matched, return the starting index
          }
      }
      return -1; // Needle not found in haystack
  }
}
// k initialized outside of the loop so that we can compare to the needle after iterating
// i will point to the start of the iteration.  Return if needle is found. 

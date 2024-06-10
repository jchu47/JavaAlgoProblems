class Solution {
  public int minDepth(TreeNode root) {
      if (root == null) {
          return 0;
      }

      if (root.left == null && root.right == null) {
          return 1;
      }

      if (root.left == null) {
          return minDepth(root.right) + 1;
      }

      if (root.right == null) {
          return minDepth(root.left) + 1;
      }
      return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
  }
}

// Set up values to return.  If node is a leaf, return 1.  If there exists a left or a right, recurse through that node.
// return the Math.min comparing the left and right first nodes. 

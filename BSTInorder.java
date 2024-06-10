import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {

      List<Integer> visited = new ArrayList<>();
      Stack<TreeNode> stack = new Stack<>();
      TreeNode current = root;

      while (current != null || !stack.isEmpty()) {
          // Traverse left subtree
          while (current != null) {
              stack.push(current);
              current = current.left;
          }

          // Visit current node
          current = stack.pop();
          visited.add(current.val);

          // Move to right subtree
          current = current.right;
      }

      return visited;
  }
}

// Initialize a visited array and a stack to keep track of when you visisted a node and what you still need to visit.
// Push the current node/pointer to the stack, reassign pointer to the left.
// Reassign current pointer to the last node on the stack, add to the visited List.  Reassign to the right.

// Think of this traversal as getting the left most nodes first and working your way to the right. 
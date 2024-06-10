import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> preorderTraversal(TreeNode root) {
      if (root == null) {
          return new ArrayList<>(); // Return an empty list if the root is null
      }
      List<Integer> visited = new ArrayList<>();
      Stack<TreeNode> stack = new Stack<>();
      stack.push(root); // Add the root node to the stack
      while (!stack.isEmpty()) {
          TreeNode currentNode = stack.pop();
          visited.add(currentNode.val); // Add the current node's value to the visited list
          // Process right subtree first because we are using a stack
          if (currentNode.right != null) {
              stack.push(currentNode.right); // Push right child onto the stack
          }
          // Process left subtree
          if (currentNode.left != null) {
              stack.push(currentNode.left); // Push left child onto the stack
          }
      }
      return visited; // Return the list of visited nodes in preorder traversal
  }
}

// Think of this traversal as starting at the top, and go left until you're forced to the right. Similar to Depth First Search
// Push the root node.  Push to the visited.
// Push right node and then the left node
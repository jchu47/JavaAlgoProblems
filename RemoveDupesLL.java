class Solution {
  public ListNode deleteDuplicates(ListNode head) {
      ListNode curr = head;

      while (curr != null && curr.next != null) {
          if (curr.val == curr.next.val) {
              curr.next = curr.next.next; // Skip the duplicate node
          } else {
              curr = curr.next; // Move to the next node
          }
      }
      return head;
  }
}

// Only needs one pointer.  Traverse and compare to curr.next.  If they are dupes, reassign curr.next to the next node with curr.next.next.
// Else: move the curr node pointer.
// The head will now be the updated Linked List
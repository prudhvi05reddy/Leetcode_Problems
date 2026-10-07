class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start from the head
        ListNode current = head;
        
        // Traverse until the end
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip duplicate node
                current.next = current.next.next;
            } else {
                // Move to next node
                current = current.next;
            }
        }
        
        return head;
    }
}

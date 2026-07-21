
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start the recursive process with an initial carry of 0
        return add_recursively(l1, l2, 0);
    }
    
    private ListNode add_recursively(ListNode l1, ListNode l2, int carry) {
        // Base Case: If both lists are exhausted and there is no carry left
        if (l1 == null && l2 == null && carry == 0) { 
            return null; 
        }

        // 1. Calculate sum for current position (including carry)
        int sum = carry;
        if (l1 != null) sum += l1.val;
        if (l2 != null) sum += l2.val;

        // 2. Create the new node with the current digit (Sum % 10)
        ListNode result = new ListNode(sum % 10);

        // 3. Calculate the new carry for the next step (Sum / 10)
        int newcarry = sum / 10;

        // 4. Recursive Step: Build the next connection
        result.next = add_recursively(
            // Move to next node or pass null if list is exhausted
            (l1 != null) ? l1.next : null,
            (l2 != null) ? l2.next : null,
            newcarry
        );
        return result;
    }
}
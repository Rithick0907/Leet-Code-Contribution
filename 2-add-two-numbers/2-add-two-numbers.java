/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode getLastNode(ListNode list){
        ListNode temp = list;
        while(temp.next != null)
            temp = temp.next;
        return temp;
    }
    private ListNode addNode(ListNode list, int val){
        ListNode node = new ListNode(val);
        if(list == null)
            list = node;
        else{
            ListNode lastNode = getLastNode(list);
            lastNode.next = node;
        }
        return list;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)  return l2;
        else if (l2 == null)   return l1;
        
        int num1 = 0, num2 = 0, sum = 0, carry = 0;
        ListNode result = null;
        
        while(l1 != null || l2 != null){
            num1 = (l1 != null) ? l1.val : 0;
            num2 = (l2 != null) ? l2.val : 0;
            sum = num1 + num2 + carry;
            carry = (sum >= 10) ? 1 : 0;
            sum %= 10;
            result = addNode(result,sum);
            l1 = (l1 != null) ? l1.next : l1;
            l2 = (l2 != null) ? l2.next : l2;
        }
        
        if(carry != 0)
            addNode(result, carry);
        
        return result;
    }
}
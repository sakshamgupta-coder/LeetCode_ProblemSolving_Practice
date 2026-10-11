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
    public ListNode deleteDuplicates(ListNode head) {
      
        if(head==null ||head.next==null)return head;
        int flag=1;
        ListNode temp=head;
        ListNode head1=new ListNode(0);
        ListNode temp1=head1;
        while(temp.next !=null){
            if(temp.val==temp.next.val){flag++;}
            else{
                if(flag==1){
                    temp1.next=temp;
                    temp1=temp1.next;
                }
                flag=1;
                }
                temp=temp.next;
        }
        if(flag==1){
            temp1.next=temp; temp1=temp1.next;
        }

        temp1.next=null;
  return head1.next;
    }
}
package LeetCode;
import java.util.*;

public class mergeLists {
    public static void main(String[] args){

    }

    static ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(ListNode node : lists){
            ListNode curr = node;
            while(curr != null){
                queue.offer(curr.val);
                curr = curr.next;
            }
        }

        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(!queue.isEmpty()) {
            curr.next = new ListNode(queue.poll());
            curr = curr.next;
        }

        return head.next;
    }

}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x ; }
}

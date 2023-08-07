import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current = null;
        ListNode root = current;
        if(list1 == null){
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        if(list1.val <= list2.val){
            root = list1;
            current = list1;
            list1 = list1.next;
            current.next = null;
        } else {
            root = list2;
            current = list2;
            list2 = list2.next;
            current.next = null;
        }
        while (list1 != null || list2 != null){
            if(list2 == null){
                current.next = list1;
                break;
            } else if(list1 == null){
                current.next = list2;
                break;
            }
            if(list1.val <= list2.val){
                current.next = list1;
                current = list1;
                list1 = list1.next;
                current.next = null;
            } else {
                current.next = list2;
                current = list2;
                list2 = list2.next;
                current.next = null;
            }
        }

        return root;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node findmid(Node head){
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    static Node letsmerge(Node left , Node right){
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(left != null && right != null){
            if(left.data < right.data){
                temp.next = left;
                temp = left;
                left = left.next;
            }
            else {
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }
        while(left != null){
            temp.next = left;
            temp = left;
            left = left.next;
        }
        while(right != null){
            temp.next = right;
            temp = right;
            right = right.next;
        }
        return dummy.next;
    }
    
    
    static Node mergeSort(Node head)
    {
        // add your code here
        if(head == null || head.next == null){
            return head;
        }
        
        Node mid = findmid(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        Node mergelist = letsmerge(left , right);
        return mergelist;
    }
}

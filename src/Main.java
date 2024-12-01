//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static Node sort(Node head) {
        Node head0 = null, head1 = null, head2 = null;

        while (head != null) {
            Node next = head.next;
            if (head.val == 0) {
                head.next = head0;
                head0 = head;
            } else if (head.val == 1) {
                head.next = head1;
                head1 = head;
            } else {
                head.next = head2;
                head2 = head;
            }

            head = next;
        }

        Node returnHead = new Node(-1);
        Node cur = returnHead;

        if (head0 != null) {
            cur.next = head0;
            while (cur.next != null) {
                cur = cur.next;
            }
        }

        if (head1 != null) {
            cur.next = head1;
            while (cur.next != null) {
                cur = cur.next;
            }
        }

        cur.next = head2;

        return returnHead.next;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
 		int[] arr = {1,0,2,1,0,2};
 		Node head = new Node(-1);

 		Node cur = head;

 		for(int val:arr){
 		    cur.next = new Node(val);
 		    cur = cur.next;
 		}

 		head = head.next;

 		head = sort(head);

 		while(head != null){
 		    System.out.print(head.val + " ");
 		    head = head.next;
 		}
    }
}
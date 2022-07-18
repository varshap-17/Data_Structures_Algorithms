package bridgelabz;

public class Orderedlist {
	    Node head; 
	    
	    class Node {
	        int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	  
	    Node newNode(int key)
	    {
	        return new Node(key);
	    }
	  
	    void sort() {
	        Node Ahead = new Node(0), Dhead = new Node(0);
	  
	        // Split the list into lists
	        splitList(Ahead, Dhead);
	  
	        Ahead = Ahead.next;
	        Dhead = Dhead.next;
	  
	        // reverse the descending list
	        Dhead = reverseList(Dhead);
	  
	        // merge the 2 linked lists
	        head = mergeList(Ahead, Dhead);
	    }
	  
	    /* Function to reverse the linked list */
	    Node reverseList(Node Dhead)
	    {
	        Node current = Dhead;
	        Node prev = null;
	        Node next;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        Dhead = prev;
	        return Dhead;
	    }
	  
	    /* Function to print linked list */
	    void printList()
	    {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	  
	    Node mergeList(Node head1, Node head2)
	    {
	        if (head1 == null)
	            return head2;
	        if (head2 == null)
	            return head1;
	  
	        Node temp = null;
	        if (head1.data < head2.data) {
	            temp = head1;
	            head1.next = mergeList(head1.next, head2);
	        }
	        else {
	            temp = head2;
	            head2.next = mergeList(head1, head2.next);
	        }
	        return temp;
	    }
	 
	    void splitList(Node Ahead, Node Dhead)
	    {
	        Node ascn = Ahead;
	        Node dscn = Dhead;
	        Node curr = head;
	  
	        while (curr != null) {
	            // Link alternate nodes in ascending order
	            ascn.next = curr;
	            ascn = ascn.next;
	            curr = curr.next;
	  
	            if (curr != null) {
	                dscn.next = curr;
	                dscn = dscn.next;
	                curr = curr.next;
	            }
	        }
	  
	        ascn.next = null;
	        dscn.next = null;
	    }
	  
	    /* Driver program to test above functions */
	    public static void main(String args[])
	    {
	        Orderedlist Olist = new Orderedlist();
	        Olist.head = Olist.newNode(10);
	        Olist.head.next = Olist.newNode(40);
	        Olist.head.next.next = Olist.newNode(53);
	        Olist.head.next.next.next = Olist.newNode(30);
	        Olist.head.next.next.next.next = Olist.newNode(67);
	        Olist.head.next.next.next.next.next = Olist.newNode(12);
	        Olist.head.next.next.next.next.next.next = Olist.newNode(89);
	  
	        System.out.println("Given Ordered list");
	        Olist.printList();
	  
	        Olist.sort();
	  
	        System.out.println("Sorted Ordered list");
	        Olist.printList();
	    }
}

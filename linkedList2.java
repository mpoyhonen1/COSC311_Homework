/**
 * Mark Poyhonen
 * http://people.emich.edu/mpoyhone/311/LinkedListHW3.java
 * COSC 311
 * HW 01/12
 * Winter 2017 
 */
public class LinkedListHW3 {
	private Node head;
	
	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	   }

	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}else {
			Node tmp = head;
			while (tmp.next != null)
				tmp = tmp.next;
			tmp.next = new Node(data);
		}
		
	}
	
	public Node removeFromEnd(int k) {
        Node first = head, second = head;
        if(head == null){
             return head;
        }
        if(k < 0){
            return head;
        }
        while(k >= 0){
             second = second.next;
             k--;
        }
        if(second == null) {
             Node tmp;
             tmp = head;
             head = head.next;
         }else {
             Node tmp;            
             while(second.next != null) {
                 first = first.next;
                 second = second.next;
             }
             tmp = first.next;
             first.next = first.next.next;
             tmp = tmp.next;
        }
        return head;
 }
	
	public void printList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListHW3 intLinkList = new LinkedListHW3();

		int[] intArr = { 0, 2, 4, 6, 1 };

		for (int i = 0; i < intArr.length; i++)
			intLinkList.add(intArr[i]);

		intLinkList.printList();
		intLinkList.removeFromEnd(4);
		intLinkList.printList();
	}

}


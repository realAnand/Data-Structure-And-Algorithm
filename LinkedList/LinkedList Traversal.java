public static void LinkedListTraversal(Node head){
	Node curr = head;
	while(curr != null){
	   System.out.print(curr.data+" ");
	   curr = curr.next;
	}
}

public static Node deleteLastNode(Node head){
	if(head == null && head.next == null){
		return null;
	}
	Node curr = head;
	while(curr.next.next != null){
		cur = curr.next;
	}
	curr.next = null;
	return head;
}
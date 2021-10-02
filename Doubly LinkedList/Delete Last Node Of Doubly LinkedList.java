public static Node deleteLastNodeInDoublyLinkedList(Node head){
	if(head == null || head.next == null){
		return null;
	}
	Node curr = head;
	while(curr.next != null){
		curr = curr.next;
	}
	curr.prev.next = null;
	return head;
}
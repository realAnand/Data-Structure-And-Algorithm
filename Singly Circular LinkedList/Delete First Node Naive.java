public static Node deleteFirstNode(Node head){
	if(head == null || head.next == head){
		return null;
	}
	else{
		Node curr = head;
		while(curr.next != head){
			curr = curr.next;
		}
		curr.next = head.next;
		return curr.next;
	}
}
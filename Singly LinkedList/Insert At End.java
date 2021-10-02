public static Node insertAtEnd(Node head, int data){
	Node temp = new Node(data);
	if(head == null){
		return temp;
	}
	Node curr = head;
	while(curr.next != null){
		curr = curr.next;
	}
	curr.next = temp;
	return head;
}
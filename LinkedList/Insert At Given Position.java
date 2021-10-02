public static Node insertAtPosition(Node head, int pos, int data){
	Node temp = new Node(data);
	if(pos < 1){
		return head;
	}
	if(pos == 1){
		temp.next = head;
		return temp;
	}
	Node curr = head;
	for(int i=0; i<pos-2 && curr != null; i++){
		curr = curr.next;
	}
	if(curr == null){
		return head;
	}
	temp.next = curr.next;
	curr.next = temp;
	return head;
}
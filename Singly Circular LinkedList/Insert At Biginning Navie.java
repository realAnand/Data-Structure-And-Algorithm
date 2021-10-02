public static Node insertAtBiginning(Node head, int data){
	Node temp = new Node(data);
	if(head == null){
		temp.next = temp;
	}
	else{
		Node curr = head;
		while(curr.next != head){
			curr = curr.next;
		}
		curr.next = temp;
		temp.next = head;
	}
	return temp;
}
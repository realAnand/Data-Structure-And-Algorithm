public static Node insertAtBiginning(Node head,int data){
	Node temp = new Node(data);
	temp.next = head;
	if(head != null){
		head.prev = temp;
	}
	return temp;
}
public static Node insertAtBiginning(Node head,int data){
	Node temp = new Node(data);
	temp.next = head;
	return temp;
}

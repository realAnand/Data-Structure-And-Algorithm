public static Node insertAtBiginningEfficeint(Node head,int data){
	Node temp = new Node(data);
	if(head == null){
		temp.next = temp;
		return temp;
	}
	else{
		temp.next = head.next;
		head.next = temp;
		int t = head.data;
		head.data = temp.data;
		temp.data = t;
		return head;
	}
}
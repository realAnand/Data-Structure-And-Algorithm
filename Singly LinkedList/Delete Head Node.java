public static Node deleteHeadNode(Node head){
	if(head == null){
		return null;
	}
	return head.next;
}
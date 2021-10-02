public static Node deleteKthNode(Node head,int k){
	if(head == null){
		return head;
	}
	if(k==1){
		if(head == null || head.next == head){
			return null;
		}
		else{
			head.data = head.next.data;
			head.next = head.next.next;
			return head;
		}
	}
	else{
		Node curr = head;
		for(int i=0; i<k-2; i++){
			curr = curr.next;
		}
		curr.next = curr.next.next;
		return head;
	}
}
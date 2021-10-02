public static int searchElementIteratively(Node head,int data){
	int pos = 1;
	Node curr = head;
	while(curr != null){
		if(curr.data == data){
			return pos;
		}
		else{
			pos++;
			curr = curr.next;
		}
	}
	return -1;
}
public static int searchRecursively(Node head,int data){
	if(head == null){
		return -1;
	}
	if(head.data == data){
		return 1;
	}
	else{
		int res = searchrecursively(head.next,data);
		if(res == -1){
			return -1;
		}
		else{
			return res+1;
		}
	}
}
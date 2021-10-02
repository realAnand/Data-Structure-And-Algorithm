public static void RecursiveTraversal(Node head){
	Node currNode = head;
	if(currNode != null) {
		System.out.print(currNode.data+" ");
		RecursiveTraversal(currNode.next);
	}
}

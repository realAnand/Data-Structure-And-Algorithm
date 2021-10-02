public static void singlyCircularLinkedlistTraversal(Node head){
	Node curr = head;
	do{
		System.out.print(curr.data+" ");
		curr = curr.next; 
	}
	while(curr != head);
}
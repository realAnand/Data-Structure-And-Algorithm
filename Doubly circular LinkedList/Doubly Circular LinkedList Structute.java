class Node{
	ind data;
	Node next;
	Node prev;
	Node(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
class Main{
	public static void main(String args[]){
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(15);
		Node temp3 = new Node(30);
		head.next = temp1;
		head.prev = temp3;
		temp1.next = temp2;
		temp1.prev = head;
		temp2.next = temp3;
		temp2.prev = temp1;
		temp3.next = head;
		temp3.prev = temp2;
	}
}
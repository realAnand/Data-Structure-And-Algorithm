class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class main{
	public static void main(String args[]){
		Node n1 = new Node(10);
		n1.next = new Node(15);
		n1.next.next = new Node(20);
		n1.next.next.next = new Node(25);
	}
}

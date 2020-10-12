
public class MyList {
	MyNode head;
	
	public void printList() {
		if(head == null) return;
		MyNode t = head;
		
		while(t != null) {
			t.printNode();
			t = t.next;
		}
	}
}

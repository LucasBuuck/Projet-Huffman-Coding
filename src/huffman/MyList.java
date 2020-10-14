package huffman;

public class MyList {
	MyNodeL head;
	
	public void printList() {
		if(head == null) return;
		MyNodeL t = head;
		
		while(t != null) {
			t.printNode();
			t = t.next;
		}
	}
	
	public int getSizeList() {
		MyNodeL temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
}


public class MyNode{
		int occur;
		char letter;
		MyNode next;
		
		public MyNode(int occur, char letter, MyNode next) {
			this.occur = occur;
			this.letter = letter;
			this.next = next;
		}
		
		public void checkExist(char c) {
			if(this.letter == c ) {
				this.occur++;
				return;
			}
			if(next != null)
				this.next.checkExist(c);
			else 
				this.next = new MyNode(1, c, null);
		}
		public void printNode() {
			System.out.println("Letter : " + letter + " Occur : " + occur);
		}
}
package huffman;

public class MyNodeL{
		int occur;
		char letter;
		MyNodeL next;
		
		public MyNodeL(int occur, char letter, MyNodeL next) {
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
				this.next = new MyNodeL(1, c, null);
		}
		public void printNode() {
			System.out.println("Letter : " + letter + " Occur : " + occur);
		}
		
}
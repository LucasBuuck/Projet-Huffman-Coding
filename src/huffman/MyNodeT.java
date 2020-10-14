package huffman;

public class MyNodeT {
	char letter;
	int weight;
	
	MyNodeT left;
	MyNodeT right;
	
	public MyNodeT(char letter, int weight) {
		this.letter = letter;
		this.weight = weight;
		this.left = null;
		this.right = null;
	}
	
	public MyNodeT(MyNodeT left, MyNodeT right) {
		this.letter = '0';
		this.weight = left.weight + right.weight;
		this.left = left;
		this.right = right;
	}

	public void printNode() {
		if(this.letter == '0')System.out.print("NODE Weight " + weight);
		else {
			System.out.print("Letter : " + this.letter + " Weight : " + weight);
		}
		if (left != null) {
			System.out.print("(");
			left.printNode();
			System.out.println(")");
		}
		if (right != null) {
			System.out.print("[");
			right.printNode();
			System.out.println("]");
		}
	}
}

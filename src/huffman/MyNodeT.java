package huffman;

import java.io.FileWriter;
import java.io.IOException;

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

	public void printDico(FileWriter f,String s) throws IOException {
		if(this.letter != '0')  f.write(letter +":" + s +'\n');

		if (left != null) {
			 left.printDico(f,s+"0");
		}
		if (right != null) {
			 right.printDico(f,s+"1");
		}
		
	}
}

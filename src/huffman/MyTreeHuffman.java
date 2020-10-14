package huffman;

import java.util.ArrayList;

public class MyTreeHuffman {
	MyNodeT root;
	
	MyTreeHuffman(MyList l){
		root = constructTree(l);
	}

	private MyNodeT constructTree(MyList l) {
		 ArrayList<MyNodeT> tempArray = new ArrayList<MyNodeT>();
		 MyNodeL temp = l.head;
		 
		 while(temp != null) {
			 tempArray.add(new MyNodeT(temp.letter, temp.occur));
		     temp = temp.next;
		 }	        
		 
		 while (tempArray.size() > 1) {
	            MyNodeT n1 = tempArray.remove(tinyElementIndex(tempArray));
	            MyNodeT n2 = tempArray.remove(tinyElementIndex(tempArray));
	            tempArray.add(new MyNodeT(n1, n2));
	        }
	        return tempArray.get(0);
	}
	
	private int tinyElementIndex(ArrayList<MyNodeT> leaves) {
		int tinyIndex = 0;
		for(int i = 0; i < leaves.size(); i++) {
			if(leaves.get(i).weight  < leaves.get(tinyIndex).weight)
				tinyIndex = i;
		}
		return tinyIndex;
	}
	
	public void printTree() {
		root.printNode();
	}
}

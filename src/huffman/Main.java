package huffman;
import java.io.IOException;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Utils.convertFileToBin("src/text.txt");
		
		
		MyList list = new MyList();
		Utils.occur(list,"src/text.txt");
		
		list.printList();
		System.out.println("Taille de la liste (nombre de caractères différents) : "+list.getSizeList());
		
		MyTreeHuffman a = new MyTreeHuffman(list);
		a.createDictionnary();
		
		@SuppressWarnings("unused")
		Dictionnary d = new Dictionnary(("src/dico.txt"));
		
		Utils.encodeHuffman("src/text.txt");
		Utils.decodeHuffman("src/huffman.txt");
		
		System.out.println("Taille du fichier de base : "+Utils.tailleFile("src/text.txt"));
		System.out.println("Taille du fichier binaire : "+Utils.tailleFile("src/bin.txt"));
		System.out.println("Taille du fichier Huffman : "+Utils.tailleFile("src/huffman.txt"));
		
		
	}

}

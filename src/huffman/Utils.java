package huffman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {
	public static int tailleFile(String filename) {
		File f = new File(filename);
		return (int) f.length();
	}
	public static void convertFileToBin(String s) throws IOException {
		BufferedReader reader = null;
	    String line;
		 FileWriter myWriter = new FileWriter("src/bin.txt");
	    try
	      {
		reader = new BufferedReader(new FileReader(s));
	      }
	    catch(FileNotFoundException exc)
	      {
		System.out.println("Erreur d'ouverture");
	      }
	    while ((line = reader.readLine()) != null)
		for(int i = 0; i < line.length(); i++) {
			String r = Integer.toBinaryString((int)line.charAt(i));
			int size = r.length();
			for(int j = 0; j < (8 - size); j++) 
				r = "0" + r;
		      myWriter.write(r);
			
		}
	    reader.close();
	    myWriter.close();
	}
	
	public static void occur(MyList l, String filename) throws IOException {
		BufferedReader reader = null;
	    String line;
	    try
	      {
		reader = new BufferedReader(new FileReader(filename));
	      }
	    catch(FileNotFoundException exc)
	      {
		System.out.println("Erreur d'ouverture");
	      }
	    while ((line = reader.readLine()) != null)
		for(int i = 0; i < line.length(); i++) {
			if(l.head == null)l.head = new MyNodeL(0,line.charAt(i),null);
			l.head.checkExist(line.charAt(i));
		}
		
	}
	
	public static void encodeHuffman(String s) throws IOException {
		BufferedReader reader = null;
	    String line;
		 FileWriter myWriter = new FileWriter("src/huffman.txt");
	    try
	      {
		reader = new BufferedReader(new FileReader(s));
	      }
	    catch(FileNotFoundException exc)
	      {
		System.out.println("Erreur d'ouverture");
	      }
	    while ((line = reader.readLine()) != null)
		for(int i = 0; i < line.length(); i++) {
			myWriter.write(Dictionnary.dictionnary.get(line.charAt(i)));
		}
	    reader.close();
	    myWriter.close();
	}
	
	public static void decodeHuffman(String s) throws IOException {
		BufferedReader reader = null;
	    String line;
		 FileWriter myWriter = new FileWriter("src/decodeHuffman.txt");
	    try
	      {
		reader = new BufferedReader(new FileReader(s));
	      }
	    catch(FileNotFoundException exc)
	      {
		System.out.println("Erreur d'ouverture");
	      }
	    while ((line = reader.readLine()) != null) {
	    	String value = "";
	    	for(int i = 0; i < line.length(); i++) {
	    		value += line.charAt(i);
	    		if(Dictionnary.dictionnary.contains(value)) {
	    			myWriter.write(Dictionnary.getKey(value));
	    			value="";
	    		}
	    	}
	    }
	    reader.close();
	    myWriter.close();
	}
}

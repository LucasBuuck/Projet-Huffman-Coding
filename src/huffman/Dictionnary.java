package huffman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Dictionnary {
	static Hashtable<Character, String> dictionnary;
	
	public Dictionnary(String filename) throws IOException {
		dictionnary = new Hashtable<Character, String>();
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
	    while ((line = reader.readLine()) != null) {
	    	String s = "";
	    	for(int i = 2; i < line.length(); i++)
	    	{
	    		s+=line.charAt(i);
	    	}
	    	dictionnary.put(line.charAt(0), s);
	    }
	}
	
	
	public static Character getKey(String value) {
		for (Entry<Character, String> entry : dictionnary.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}
	
	
}

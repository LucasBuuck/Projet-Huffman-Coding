import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
	
	public static int tailleFile(String filename) {
		File f = new File(filename);
		return (int) f.length();
	}
	public static void convertFileToBin(String s) throws IOException {
		BufferedReader reader = null;
	    String line;
		 FileWriter myWriter = new FileWriter("test.txt");
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
		      System.out.print(r);
			
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
			if(l.head == null)l.head = new MyNode(0,line.charAt(i),null);
			l.head.checkExist(line.charAt(i));
			//System.out.print((line.charAt(i)));
		}
		
	}
	public static void main(String[] args) throws IOException {
		convertFileToBin("src/text.txt");
		System.out.println("\n"+tailleFile("src/text.txt"));
		System.out.println(tailleFile("test.txt"));
		
		
		MyList list = new MyList();
		occur(list,"src/text.txt");
		
		list.printList();
	}

}

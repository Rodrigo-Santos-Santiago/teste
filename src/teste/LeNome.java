package teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeNome {

	public static void main(String[] args) {
		File f = new File("C:/Users/Lab 102/Desktop/nome.txt");
		
		try {
			FileReader fr = new FileReader(f);
			int i = fr.read();;
			while (i != -1) {
				System.out.print((char)i);
				i = fr.read();
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

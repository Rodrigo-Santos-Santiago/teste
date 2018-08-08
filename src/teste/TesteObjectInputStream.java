package teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class TesteObjectInputStream {

	public static void main(String[] args) {
		String[] teste;
		
		File f = new File("C:/Users/Lab 102/Desktop/Object.bin");
		
		try {
			FileInputStream fin = new FileInputStream(f);
			ObjectInputStream objin = new ObjectInputStream(fin);
			teste = (String[]) objin.readObject();
			
			System.out.println("Elementos do vetor: " + teste.length);
			
			for (String s : teste) {
				System.out.println("Elemento: " + s);
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class TesteObjectOutputStream {

	public static void main(String[] args) {
		String[] textos = {"nome1", "nome2", "nome3", "nome4", "nome5"};
		
		File f = new File("C:/Users/Lab 102/Desktop/Object.bin");
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(f);
			ObjectOutputStream obj = new ObjectOutputStream(fos);
			
			obj.writeObject(textos);
			obj.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim do programa");

	}

}

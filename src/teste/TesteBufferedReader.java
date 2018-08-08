package teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TesteBufferedReader {

	public static void main(String[] args) {
		File f = new File("C:/Users/Lab 102/Desktop/nome.txt");
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			while (br.ready()) {
				System.out.println(br.readLine());
				
			}
			
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim do arquivo");

	}

}

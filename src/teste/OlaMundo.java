package teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class OlaMundo {

	public static void main(String[] args) {
		File f = new File("C:/Users/Lab 102/Desktop/nome.txt");
		String nome = "";
		try {
			FileWriter fw = new FileWriter(f);
			for (int i = 0; i < 5; i++) {
				nome = JOptionPane.showInputDialog("Entre com um nome:");
				fw.write(nome + "\r\n");
				fw.flush();
				
			}
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

package com.senac.aplicacoes;

import java.io.*;

import java.util.Scanner;

public class Arquivo {

	public void criaArquivo(String nome, String telefone){
		
		try {
			
			Writer fileWriter = new FileWriter("registros.txt", true);
			fileWriter.write("\n"+nome+ "\n" + telefone);
			fileWriter.close();

			Reader fileReader = new FileReader("registros.txt");
			BufferedReader br = new BufferedReader(fileReader);

			String registro = br.readLine();
			String campos[] = registro.split(";");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
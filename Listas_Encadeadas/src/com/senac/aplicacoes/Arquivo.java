package com.senac.aplicacoes;

import java.io.*;


public class Arquivo {

	public void criaArquivo(String nome, String telefone){
		
		try {
			
			Writer fileWriter = new FileWriter("registros.txt", true);
			
			fileWriter.write("\n"+nome+ "\n" + telefone);
			fileWriter.append(System.getProperty("line.separator"));
			fileWriter.close();
			
			
			Reader fileReader = new FileReader("registros.txt");
			
			BufferedReader br = new BufferedReader(fileReader);
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
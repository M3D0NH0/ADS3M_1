package com.senac.aplicacoes;

import java.io.*;

import com.senac.estruturas.Telefone;


public class Arquivo {

	public void gravaArquivo(Telefone telefone){
		
		try {
			
			Writer fileWriter = new FileWriter("registros.txt", true);
			
			fileWriter.write("\n"+telefone.getNome()+ "\n" + telefone.getTelefone());
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
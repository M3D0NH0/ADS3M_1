package com.senac.estruturas;

public class Telefone implements Comparable<Telefone>{
	
	String nome;
	String telefone;
	
	
	public Telefone(){
		
	}
	
	public Telefone(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
	
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	public String toString(){
		String saida="";
		saida = "Nome: " + getNome() +
				"Telefone: " + getTelefone();
		return saida;
	}

	@Override
	public int compareTo(Telefone tel) {
		if(this == tel)
			return 0;

		return this.nome.compareToIgnoreCase(tel.nome);
	}


	
}

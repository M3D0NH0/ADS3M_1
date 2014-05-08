package com.senac.app;

public class Nodo {
	
	String valor;
	private Nodo nextDir;
	private Nodo nextEsq;
	
	public Nodo(String valor){
		this.valor = valor;
	}
	
	public void setProximoEsq(Nodo next){
		this.nextEsq = next;	
	}
	
	public void setProximoDir(Nodo next){
		this.nextDir = next;
	}
	
	public Nodo getProximoEsq(){
		return nextEsq;
	}
	
	
	public Nodo getProximoDir(){
		return nextDir;
	}
	
	public String getValor(){
		return this.valor;
	}
	
	public boolean interno() {
		if ((nextEsq != null) || (nextDir != null))
			return true;
		return false;
	}




	
}

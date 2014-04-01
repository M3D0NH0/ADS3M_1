package com.senac.models;


public class Jogador {
	
	
	private int vida=15;
	Mapa oceano = new Mapa();
	
	public void setVida(int vida){
		this.vida = vida;
	}
	
	public int getVida(){
		return this.vida;
	}
	
	public void atira(int c, int l){
		oceano.setAlvo(c, l);
	}
	
	public void criaMapa(){
		oceano.criaMapa();
	}
	
	public String toString(){
		return oceano.toString();
	}
	
}

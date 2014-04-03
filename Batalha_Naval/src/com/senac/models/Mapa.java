package com.senac.models;

import com.senac.navios.Navios;

public class Mapa {
	int coluna = 10;
	int linha = 10;
	String[][] mapa=new String[coluna][linha];
	String[] vetColuna=new String[coluna];
	String[][] vetNavios = new String[coluna][linha];
	Navios navio = new Navios();
	
	public void setAlvo(int c, int l){
		mapa[c][l] = "X";
	}	
	
	public void criaColunas(){
		for (int i = 0; i < vetColuna.length; i++) {
			switch(i){
			case 0:vetColuna[i] = "A";break;
			case 1:vetColuna[i] = "B";break;
			case 2:vetColuna[i] = "C";break;
			case 3:vetColuna[i] = "D";break;
			case 4:vetColuna[i] = "E";break;
			case 5:vetColuna[i] = "F";break;
			case 6:vetColuna[i] = "G";break;
			case 7:vetColuna[i] = "H";break;
			case 8:vetColuna[i] = "I";break;
			case 9:vetColuna[i] = "J";break;
			}
		}
	}
	
	public void criaMapa(){
		criaColunas();
		for (int i = 0; i < mapa.length; i++) {
			for (int x = 0; x < mapa[i].length; x++) {
				mapa[i][x] = ".";
			}
		}
	}
	
	public String toString(){
		String saida="";
		for (int i = 0; i < mapa.length; i++) {
			saida+="\n"+vetColuna[i] +" ";
			for (int x = 0; x < mapa[i].length; x++) {
				saida+=mapa[i][x]+" ";
			}
		}
		return saida;
	}
	
	public void setNavios(){
		
		
		
		
	}
	
}

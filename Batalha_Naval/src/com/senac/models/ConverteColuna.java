package com.senac.models;

public class ConverteColuna {

	public int getColuna(String coluna){
		coluna = coluna.toUpperCase();
		switch(coluna){
		case "A":return 0;
		case "B":return 1;
		case "C":return 2;
		case "D":return 3;
		case "E":return 4;
		case "F":return 5;
		case "G":return 6;
		case "H":return 7;
		case "I":return 8;
		case "J":return 9;
		default: System.out.println("Opcao Invalida!");
		}
		return 100;
	}


}
package com.senac.estruturas;
import java.util.Scanner;

public class Principal {

	public static int coluna = 10;
	public static int linha = 10;
	public static String[][] mapa=new String[coluna][linha];
	public static Scanner sc=new Scanner(System.in);
	public static String opcaoColuna = "";
	public static int opcaoLinha;
	public static String[] vetColuna=new String[coluna];
	public static Barcos barco = new Barcos();
	public static ConverteColuna convCol=new ConverteColuna();
	

	public static void criaColunas(){
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
	
	
	
	public static void main(String[] args) {
		criaColunas();
		
		
				
		
		for (int i = 0; i < mapa.length; i++) {
			for (int x = 0; x < mapa[i].length; x++) {
				mapa[i][x] = ".";
			}
		}

		for (int i = 0; i < mapa.length; i++) {
			System.out.print("\n"+vetColuna[i] +" ");
			for (int x = 0; x < mapa[i].length; x++) {
				System.out.print(mapa[i][x]+" ");
			}
		}

		System.out.println();
		System.out.println("Em qual coluna voce deseja atirar?");
		opcaoColuna = sc.next();
		System.out.println("Em qual linha voce deseja atirar?");
		opcaoLinha = sc.nextInt();
		
		System.out.println(convCol.getColuna(opcaoColuna));
		
	}
}

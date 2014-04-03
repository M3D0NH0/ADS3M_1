package com.senac.controler;
import java.util.Scanner;

import com.senac.models.Jogador;
import com.senac.models.Mapa;
import com.senac.models.ConverteColuna;
import com.senac.navios.Navios;

public class Principal {

	public static Scanner sc=new Scanner(System.in);
	public static String opcaoColuna = "";
	public static int opcaoLinha;
	public static Navios barco = new Navios();
	public static ConverteColuna convCol=new ConverteColuna();
	public static int vida=15;
	
	
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
		
		jogador1.criaMapa();
		
		
		System.out.println(jogador1);
		do{
		System.out.println();
		System.out.println("Em qual coluna voce deseja atirar?");
		opcaoColuna = sc.next();
		System.out.println("Em qual linha voce deseja atirar?");
		opcaoLinha = sc.nextInt();

		
		jogador1.atira(convCol.getColuna(opcaoColuna),opcaoLinha);
		
		System.out.println(jogador1);
		}while(vida!=0);
		
	}
}
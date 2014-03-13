package com.senac.principal;

import com.senac.estruturas.*;
import com.senac.aplicacoes.*;
import java.util.Scanner;
public class Execucao {

	public static Arquivo registro = new Arquivo();
	public static String opcao = "nao";

	public static void main(String[] args) {
		String nome;
		String telefone;

		Scanner sc=new Scanner(System.in);

		System.out.println("Lista Telefonica:\n");
		System.out.println("O que você deseja fazer?" +
							"1 - Inserir" +
							"2 - Remover" +
							"3 - Pesquisar");
		
		while(opcao.equals("nao")){
			System.out.println("Você Deseja Inserir novos contatos?");
			
			System.out.println("Digite o nome a ser inserido:");
			nome = sc.next();
			System.out.println("Digite o numero a ser inserido:");
			telefone = sc.next();
			registro.criaArquivo(nome, telefone);

			System.out.println("Você deseja sair?");
			opcao = sc.next();
			
		}
		
	}

}

package com.senac.principal;

import com.senac.estruturas.*;
import com.senac.aplicacoes.*;
import java.util.Scanner;
public class Execucao {

	public static Arquivo registro = new Arquivo();
	public static String opcao = "nao";
	public static int funcao=0;
	public static Scanner sc=new Scanner(System.in);
	
	public static ListaOrdenada<String> lista = new ListaOrdenada<String>();
	public static Nodo<String> nodo = new Nodo();
	
	
	public static void insereContatos(){
		String nome;
		String telefone;

		System.out.println("Digite o nome a ser inserido:");
		nome = sc.next();
		System.out.println("Digite o numero a ser inserido:");
		telefone = sc.next();
		lista.insert(new Nodo<String>(nome));
		lista.insert(new Nodo<String>(telefone));
		registro.criaArquivo(nome, telefone);
	}
	
	public static void removeContatos(){
		
	}
	
	public static void pesquisaContatos(){
		
	}

	public static void mostraContatos(){
		lista.print();
		
	}
	public static void main(String[] args) {
		
		System.out.println("Lista Telefonica:\n");

		while(opcao.equals("nao")){
			System.out.println("O que você deseja fazer?" +
					"\n1 - Inserir" +
					"\n2 - Remover" +
					"\n3 - Pesquisar");
			funcao = sc.nextInt();
			switch(funcao){
			case 1 :
				insereContatos();
				break;
			case 2 :
				removeContatos();
				break;
			case 3 :
				pesquisaContatos();
				break;
			case 4 :
				mostraContatos();
				break;
			default :
				System.out.println("Opcao Invalida!");
			}
			System.out.println("Você deseja sair?");
			opcao = sc.next();

		}

	}

}

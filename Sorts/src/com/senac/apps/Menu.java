package com.senac.apps;

import com.senac.estruturas.InsertionSort;
import com.senac.estruturas.QuickSort;
import java.util.Scanner;


public class Menu {
	static int n = 0;
	static Scanner sc=new Scanner(System.in);
	static int[] vet1;
	static int[] vet2;

	public static void criaVetor(){
		System.out.println("Qual o Tamanho do seu Vetor?");
		n = sc.nextInt();
		vet1 = new int[n];
		vet2 = new int[n];

		int aux = vet1.length;
		for(int i = 0; i < vet1.length; i++){
			System.out.println("Você precisa inserir "+ aux + " numeros no Vetor.");
			System.out.println("Digite o Valor que você deseja Inserir: ");
			vet1[i] = sc.nextInt();
			vet2[i] = vet1[i];
			aux--;
		}
	}


	public static void main(String[] args) {
		criaVetor();
		InsertionSort insertion = null;
		QuickSort quick= null ;
		int opcao=0;
		int opcaoAux=0;
		do{
			System.out.println("Qual Sort voce quer utilizar?\n"+
					"0 - Insertion Sort"+
					"\n1 - Quick Sort" +
					"\n2 - Mostra Vetor" +
					"\n3 - Volta aos Valores Iniciais");
			opcao= sc.nextInt();
			switch(opcao){
			case 0:
				insertion = new InsertionSort(vet1);
				insertion.insertionSort();
				opcaoAux = 0;
				break;
			case 1:
				quick = new QuickSort(vet1);
				quick.quick_sort( 0, vet1.length-1);
				opcaoAux = 1;
				break;
			case 2:
				if(opcaoAux == 0){
					if(insertion == null) break;
					System.out.println(insertion);
				}else{
					if(quick == null) break;
					System.out.println(quick);
				}
				break;
			case 3:
				for (int i = 0; i < vet1.length; i++) {
					vet1[i] = vet2[i];
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Opcao Invalida!");
			}
		}while(opcao != 4);
	}

}

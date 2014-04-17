package com.senac.estruturas;

import java.util.Scanner;


public class QuickSort {

	Scanner sc=new Scanner(System.in);
	int[] vet1;

	public QuickSort(int n){
		setTamVet(n);
	}
	
	public void Executa(){
		criaVetor();
		toString();
		quick_sort(vet1, 0, getTamVet());
		toString();
	}
	public void criaVetor(){
		for(int i = 0; i < getTamVet(); i++){
			int aux = getTamVet();
			System.out.println("Você precisa inserir "+ aux + " numeros no Vetor.");
			System.out.println("Digite o Valor que você deseja Inserir: ");
			vet1[i] = sc.nextInt();
			aux--;
		}
	}


	public void setTamVet(int n){
		vet1 = new int[n];
	}

	public int getTamVet(){
		int n;
		n = vet1.length-1;
		return n;
	}

	public void quick_sort(int vet[], int low, int n){
		int menor = low;
		int maior = n;

		if(menor >= n){
			return;
		}
		int meio = vet[(menor + maior)/2];

		while(menor < maior){

			while(menor < maior && vet[menor] < meio){
				menor++;
			}
			while(menor< maior && vet[maior] > meio){
				maior--;
			}
			if(menor < maior){
				int aux = vet[menor];
				vet[menor] = vet[maior];
				vet[maior] = aux;
			}
		}
		if(maior < menor){
			int aux = maior;
			maior = menor;
			menor = aux;
		}
		
		quick_sort(vet, low, menor);
		quick_sort(vet, menor == low ? menor + 1 : menor, n);

	}

	public String toString(){
		String saida="";
		for (int i = 0; i < getTamVet(); i++) {
			saida+= " "+ vet1[i]; 
		}

		return saida;	
	}

}

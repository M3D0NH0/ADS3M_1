package com.senac.estruturas;

public class QuickSort {

	int[] vet1;

	public QuickSort(){
		
	}
	
	public QuickSort(int n){
		vet1 = new int[n];
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
			while(menor < maior && vet[maior] > meio){
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
		for (int i = 0; i < vet1.length; i++) {
			saida+= " "+ vet1[i]; 
		}
		
		return saida;	
	}

}

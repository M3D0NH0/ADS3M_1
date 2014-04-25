package com.senac.estruturas;


public class InsertionSort {
	static int step;
	int[] vet1;

	public InsertionSort(){

	};

	public InsertionSort(int n){
		int step = 1;
		vet1 = new int[n];
	}	

	public void insertionSort(int[] vetor){
		
		int n = vetor.length;

		for (int i = 0; i < n; i++) {
			int chave = vetor[i];
			int j = i-1;
			while((j > -1) && (vetor[j] > chave)){
				vetor[j+1] = vetor[j];
				j--;
				step++;
			}
			vetor[j+1] = chave;

		}
		 
		
	}

	public int getStep(){
		return this.step;
	}

	public String toString(){
		String saida="";
		for (int i = 0; i < vet1.length; i++) {
			saida += vet1[i] + ", ";
		}
		saida+= "\nQuantidade de comparcoes utilizadas: "+getStep() + "\n";
		return saida;
	}
}

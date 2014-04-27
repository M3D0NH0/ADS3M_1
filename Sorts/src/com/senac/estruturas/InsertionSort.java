package com.senac.estruturas;


public class InsertionSort {
	int step;
	int[] vet1;

	public InsertionSort(){

	};

	public InsertionSort(int[] n){
		step = 0;
		vet1 = n;
	}	

	public void insertionSort(){
		
		int n = vet1.length;

		for (int i = 0; i < n; i++) {
			int chave = vet1[i];
			int j = i-1;
			while((j > -1) && (vet1[j] > chave)){
				vet1[j+1] = vet1[j];
				j--;
				step++;
			}
			vet1[j+1] = chave;

		}
		 
		
	}

	public int getStep(){
		return this.step;
	}

	public String toString(){
		String saida="";
		for (int i = 0; i < vet1.length; i++) {
			saida += vet1[i] + "\n";
		}
		saida+= "\nQuantidade de comparcoes utilizadas: "+getStep() + "\n";
		return saida;
	}
}

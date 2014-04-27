package com.senac.estruturas;

public class QuickSort {

	int[] vet;
	int step;
	
	public QuickSort(int[] n){
		vet = n;
		step = 0;
	}

	public void quick_sort(int low, int n){
		int menor = low;
		int maior = n;

		if(menor >= n){
			step++;
			return;
		}
		int meio = vet[(menor + maior)/2];

		while(menor < maior){
			
			while(menor < maior && vet[menor] < meio){
				menor++;
				step++;
			}
			while(menor < maior && vet[maior] > meio){
				maior--;
				step++;
			}
			if(menor < maior){
				int aux = vet[menor];
				vet[menor] = vet[maior];
				vet[maior] = aux;
				step++;
			}
		}
		if(maior < menor){
			int aux = maior;
			maior = menor;
			menor = aux;
			step++;
		}
		
		quick_sort(low, menor);
		
		int lowTemp;
		if(menor == low){
			lowTemp = menor + 1;
			step++;
		} else {	
			lowTemp= menor;
			step++;
		}
		
		quick_sort(lowTemp, n);

	}

	public int getStep(){
		return this.step;
	}
	
	public String toString(){
		String saida="";
		for (int i = 0; i < vet.length; i++) {
			saida+= vet[i] + "\n";
		}
		saida+= "\nQuantidade de comparcoes utilizadas: "+getStep() + "\n";
		return saida;	
	}

}

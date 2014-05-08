package com.senac.app;

public class Tree {

	private Nodo raiz;

	public Tree(Nodo raiz) {
		this.raiz = raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	public Nodo getRaiz() {
		return this.raiz;
	}

	public void insert(String valor) {

		Nodo aux = raiz;

		Nodo novo = new Nodo(valor);

		while (aux != null) {

			if (valor.length() > aux.getValor()) {

				if (aux.getProximoDir() != null)

					aux = aux.getProximoDir();
				else {
					aux.setProximoDir(novo);
					aux = null;
				}

			} else {

				if (aux.getProximoEsq() != null)
					aux = aux.getProximoEsq();
				else {
					aux.setProximoEsq(novo);
					aux = null;
				}
			}
		}
	}

	public void preOrder(Nodo elemento) {
		if (elemento != null) {
			System.out.println(elemento.getValor() + "\n");
			if (elemento.interno()) {
				preOrder(elemento.getProximoEsq());
				preOrder(elemento.getProximoDir());
			}
		}
	}

	public void postOrder(Nodo elemento) {
		if (elemento != null) {
			if (elemento.interno()) {
				postOrder(elemento.getProximoEsq());
				postOrder(elemento.getProximoDir());
			}
			System.out.println(elemento.getValor() + "\n");
		}
	}

	public void inOrder(Nodo elemento) {
		if (elemento != null) {
			if (elemento.interno()) {
				inOrder(elemento.getProximoEsq());
			}
			System.out.println(elemento.getValor() + "\n");
			if (elemento.interno()) {
				inOrder(elemento.getProximoDir());
			}
		}
	}

	public int altura() {
		return calculaAltura(this.raiz, 0);
	}

	private int calculaAltura(Nodo elemento, int altura) {

		if (elemento != null) {

			if (elemento.interno()) {

				int auxa = calculaAltura(elemento.getProximoEsq(), altura + 1);
				int auxb = calculaAltura(elemento.getProximoDir(), altura + 1);
				if (auxa > auxb)
					return auxa;
				else
					return auxb;
			} else {
				return altura;
			}
		}
		return 0;
	}
}

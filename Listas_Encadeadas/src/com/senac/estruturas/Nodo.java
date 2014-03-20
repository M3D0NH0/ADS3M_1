package com.senac.estruturas;

public class Nodo<T extends Comparable<T>> implements Comparable<Nodo<T>> {

	private T chave;
	private Nodo<T> next;
	private Telefone telefone1;
	private String nome;
	private String telefone;
	private Nodo nodo;

	public Nodo()
	{
		this.chave = null;
		this.next = null;
	}
	
	public Nodo(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
		
	public Nodo(T valor)
	{
		this.chave = valor;
		this.next = null;
	}

	public T getData()
	{
		return chave;
	}

	private void setData(T chave)
	{
		this.chave = chave;
	}


	public Nodo<T> getNext()
	{
		return next;
	}

	public void setNext(Nodo<T> next)
	{
		this.next = next;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	@Override
	public int compareTo(Nodo<T> nodo) {
		return chave.compareTo(nodo.getData());
	}
	
	public String toString(){
		String saida="";
		
		saida+="Nome: "+ nodo.getNome() +
				"Telefone "+ nodo.getTelefone();
		return saida;
	}
	

}
package com.senac.estruturas;

public class Nodo<T extends Comparable<T>> implements Comparable<Nodo<T>> {

	private T chave;
	private Nodo<T> next;
	private Telefone telefone = new Telefone();

	public Nodo()
	{
		this.chave = null;
		this.next = null;
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

	public Nodo<T> getNext()
	{
		return next;
	}

	public void setNext(Nodo<T> next)
	{
		this.next = next;
	}
	
	public Telefone getTelefone(){
		return this.telefone;
	}
	
	public void setTelefone(Telefone telefone){
		this.telefone = telefone;
	}

	@Override
	public int compareTo(Nodo<T> nodo) {
		return chave.compareTo(nodo.getData());
	}

}
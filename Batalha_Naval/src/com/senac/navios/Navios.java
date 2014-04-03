package com.senac.navios;

public class Navios {
	/*
1 “porta-avioes” com 5 unidades de tamanho.!
2 “destroyers” com 4 unidades de tamanho.!
2 “fragatas” com 3 unidades de tamanho.!
3 “torpedeiros” com 2 unidades de tamanho.!
5 submarinos, com 1 unidade de tamanho.!
	 */
	
	protected int size;
	protected String nome="";
	
	public String getNome(){
		return this.nome;
	}
	public int getSize(){
		return this.size;
	}
	
	public void criaNavios(){
		Fragata frag0=new Fragata();
		Fragata frag1=new Fragata();
		Destroyers dresto0=new Destroyers();
		Destroyers dresto1=new Destroyers();
		Submarinos sub0=new Submarinos();
		Submarinos sub1=new Submarinos();
		Submarinos sub2=new Submarinos();
		Submarinos sub3=new Submarinos();
		Submarinos sub4=new Submarinos();
		Torpedeiros torp0=new Torpedeiros();
		Torpedeiros torp1=new Torpedeiros();
		Torpedeiros torp2=new Torpedeiros();
		PortaAvioes portAv0=new PortaAvioes();		
	}
	
	public void setNavios(){
		criaNavios();
		
		
		
	}
	
	
	
	
}
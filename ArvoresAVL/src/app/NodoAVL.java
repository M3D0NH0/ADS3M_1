package app;

public class NodoAVL {
	
	private NodoAVL esq, dir;
	private int hDir, hEsq, FB, numero;
	
	
	
	public NodoAVL insere(NodoAVL nodo, int numero){
		NodoAVL nodo2;
		if(nodo == null){
			nodo2 = new NodoAVL();
			nodo2.hDir = 0;
			nodo2.hEsq = 0;
			nodo2.esq = null;
			nodo2.dir = null;
			nodo2.numero = numero;
			nodo = nodo2;
		}
		else if(numero < nodo.getNumero()){
			nodo.esq = insere(nodo.esq, numero);
			if(nodo.esq.hDir > nodo.esq.hEsq){
				nodo.hEsq = nodo.esq.hDir +1;
			}
			else{
				nodo.hEsq = nodo.esq.hEsq +1;
			}
			nodo = balanceamento(nodo);
		}
		else if(numero > nodo.getNumero()){
			nodo.dir = insere(nodo.dir, numero);
			if(nodo.dir.hDir > nodo.dir.hEsq){
				nodo.hDir = nodo.dir.hDir +1;
			}
			else{
				nodo.hDir = nodo.dir.hEsq +1;
			}
			nodo = balanceamento(nodo);
		}
		return nodo;
	}
	
	public void posOrder(NodoAVL nodo) {
		if (nodo != null) {
			posOrder(nodo.esq);
			posOrder(nodo.dir);
			System.out.print(nodo.getNumero() + ", ");
		}
	}
	
	
	public void remove(NodoAVL nodo){
		
		
		
	}
	
	
	public void pesquisa(NodoAVL nodo){
		
		
		
	}
	
	public NodoAVL balanceamento(NodoAVL nodo){
		nodo.FB = nodo.hEsq - nodo.hDir;
		if(nodo.FB == 2){
			if(nodo.esq.FB == -1){
				rotEsqEsq(nodo.esq);
			}
			else{
				rotDirDir(nodo);
			}
		}
		else if(FB == -2){
			if(nodo.dir.FB == 1){
				rotDirDir(nodo.dir);
			}
			else{
				rotEsqEsq(nodo);
			}
		}
		return nodo;
	}
	
	
	
	public NodoAVL rotEsqDir(NodoAVL nodo){
		nodo.esq = rotDirDir(nodo.esq);
		return rotEsqEsq(nodo);
	}
	
	public NodoAVL rotDirEsq(NodoAVL nodo){
		nodo.dir = rotEsqEsq(nodo.dir);
		return rotDirDir(nodo);
	}
	
	public NodoAVL rotEsqEsq(NodoAVL nodo){
		NodoAVL aux = nodo.esq;
		nodo.esq = aux.dir;
		aux.dir = nodo;
		return aux;
	}
	
	public NodoAVL rotDirDir(NodoAVL nodo){
		NodoAVL aux= nodo.dir;
		nodo.dir = aux.esq;
		aux.esq = nodo;
		return aux;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public int getFB(NodoAVL nodo){
		FB = nodo.hEsq - nodo.hDir;
		return this.FB;
	}
	
}

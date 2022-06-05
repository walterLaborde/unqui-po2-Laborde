package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	private List <Integer> arregloDeEnteros = new ArrayList<Integer>();
	
	
	public void add(int n) {
		this.getArregloDeEnteros().add(n);
	}
	
	public List<Integer> getArregloDeEnteros() {
		return arregloDeEnteros;
	}

	public void setArregloDeEnteros(List<Integer> arregloDeEnteros) {
		this.arregloDeEnteros = arregloDeEnteros;
	}


	public int sumarTodos() {
		int laSuma = 0;
		for (int n : this.getArregloDeEnteros()) {
			laSuma += n;
		}
		return laSuma;
	}
	
	public int multTodos() {
		int laMult = 1;
		for (int n : this.getArregloDeEnteros()) {
			laMult *= n;
		}
		return laMult;
	}
	
	public int restarTodos() {
		int laResta = 0;
		for (int n : this.getArregloDeEnteros()) {
			laResta -= n;
		}
		return laResta;
	}
	
}



package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class DesarmandoNumeros {
	
	private List<Integer> enteros = new ArrayList<Integer>();

	public DesarmandoNumeros() {
		// TODO Auto-generated constructor stub
	}

	public List<Integer> getEnteros() {
		return enteros;
	}

	public void setEnteros(List<Integer> enteros) {
		this.enteros = enteros;
	}
	
	public int desarmandoNumeros() {
		int mayorDigitosPares = 0;
		for (Integer entero : this.getEnteros()) {
			if(entero % 10 > 0) {
				this.elegirElMayorEntre((entero / 10),mayorDigitosPares);
			}
		}
		return mayorDigitosPares;
	}

	private int elegirElMayorEntre(int i, int mayorDigitosPares) {
		// TODO Auto-generated method stub
		if (i > mayorDigitosPares) {
			return i;
		}
		else {
			return mayorDigitosPares;
		}
	}

	public void addNumber(int i) {
		// TODO Auto-generated method stub
		this.getEnteros().add(i);
	}


}

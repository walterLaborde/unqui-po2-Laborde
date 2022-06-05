package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Counter {
	
	private List<Integer> numeros = new ArrayList<Integer>();
	

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}

	public int contarPares() {
		int cantidad = 0;
		for (Integer numero : this.getNumeros()) {
			if (numero % 2 == 0) cantidad++;
		}
		return cantidad;
	}
	
	public int contarImpares() {
		int cantidad = 0;
		for (Integer numero : this.getNumeros()) {
			if (numero % 2 != 0) cantidad++;
		}
		return cantidad;
	}
	
	public int cantMultiplosDe(int num) {
		int cantidad = 0;
		for (Integer numero : this.getNumeros()) {
			if (numero % num == 0) cantidad++;
		}
		return cantidad;
	}


	public void addNumber(int i) {
		// TODO Auto-generated method stub
		this.getNumeros().add(i);
	}
	
}

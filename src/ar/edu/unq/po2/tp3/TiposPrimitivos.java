package ar.edu.unq.po2.tp3;

public class TiposPrimitivos {

	/*
	1. ¿Qué son los tipos de datos primitivos?
	
	Son datos que especifican el tamaño y el tipo de valor de la variable y NO tienen
	métodos adicionales asociados.
	
	En java son:
		byte
		short
		int
		long
		float
		double
		boolean
		char
	
	2. ¿Cuál es la diferencia entre un int y un Integer?
	
		int es un tipo de dato primitivo y un Integer es de tipo Clase.. 
		El Integer es una Wrapper Class y permite, por ejemplo, convertir un int 
		en un objeto y un objeto en un int. Provee métodos para convertir los 
		valores int guardados en el Integer.
	
	3. ¿Si se define una variable de instancia de tipo int cual sería su valor 
		predeterminado? ¿Y si se define una de tipo Integer? 
		Haga la prueba en Eclipse.
	
		la variable de tipo int tiene valor 0
		la variable de tipo Integer tiene valor null
	
	4. Responder la pregunta del punto anterior (3), pero ahora en lugar de definir una variable de
		instancia se define una variable de método.

		me pide que la inicialice. 
	 * 
	 * */
	
	// pregunta 3
	
	int variableDeInstanciaINt;
	Integer varTipoInteger;
	
	public void print() {
		System.out.println(variableDeInstanciaINt);
		System.out.println(varTipoInteger);
		System.out.println(this.paraImp());
	}
	
	public int paraImp() {
		int pImp = 4;
		//variableDeInstanciaINt = pImp;
		return pImp;
	}
	
	
	public static void main(String[] args) {
		TiposPrimitivos tp = new TiposPrimitivos();
		tp.print();
	}
	
	
}

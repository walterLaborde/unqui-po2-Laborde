package ar.edu.unq.po2.claseStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {

	List<Persona> personas;

	public Agenda() {
		super();
		this.personas = new ArrayList<Persona>();
	}

	public Agenda(List<Persona> personas) {
		super();
		this.personas = personas;
	}
	
	public Boolean algunoEmpiezaCon(String inicio) {
		return this.getPersonas().stream().anyMatch(n -> n.equals(inicio));
	}
	
	
	
	public List<Persona> nombresQueEmpiezanCon(String inicio) {
		return this.getPersonas().stream().filter(n -> n.getNombre().startsWith(inicio)).collect(Collectors.toList());
	}
	
	
	public List<String> nombresParaImprimir() {
		return this.getPersonas().stream().map(n -> n.getNombre()).collect(Collectors.toList());
	}
	
	public Integer sumaDeEdades() {
		return this.getPersonas().stream().map(n -> n.getEdad()).reduce(0, (acumulado,nuevo) -> acumulado+nuevo);
	}
	
	//public Stream<Persona> ordenar

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
}

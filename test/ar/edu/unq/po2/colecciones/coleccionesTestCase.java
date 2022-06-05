package ar.edu.unq.po2.colecciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class coleccionesTestCase {
	
	/**  Define una lista de empleados */
	List<Employee> employees;
	
	/**  Define tres empleados */
	Employee employee1;
	Employee employee2;
	Employee employee3;	
	
	
	
	/**
	 * Crea un escenario de test b�sico, el cual consiste en una colecci�n
	 * con tres empleados que mantienen el orden en que fueron agregados.
	 * 
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		
		// Creo una lista de empleados vac�a e inicializo la variable 
		// de instancia previamente definida.
		employees = new ArrayList<Employee>();
		
		// Creo el primer empleado y lo agrego a la lista.
		employee1 = new Employee("Mart�n","Ballesteros", 1000.0);
		employees.add(employee1);
		
		// Creo el segundo empleado y lo agrego a la lista (agrega al final de la misma). 
		employee2 = new Employee("Ana","Etcheverry", 2000.0);
		employees.add(employee2);

		// Creo el tercer empleado y lo agrego a la lista (agrega al final de la misma). 
		employee3 = new Employee("Elena","Ortiz", 3000.0);
		employees.add(employee3);
	}

	
	/**
	 * Muestra que el tama�o de la lista es el esperado.
	 */
	@Test
	public void testSize() {
		
		// Obtengo el tama�o de la colecci�n de empleados.
		int employeesCount = employees.size();
		
		// Testeo que el tama�o de la colecci�n sea correcto.
		assertEquals(employeesCount, 3);
	}

	
	/**
	 * Muestra que el orden por default de la lista es el esperado (orden en que 
	 * fueron agregados, es decir, cada elemento se agrega al final de la lista).
	 */
	@Test
	public void testOrder() {
		
		// Obtengo el primer elemento de la lista y chequeo que sea el primero que agregu� (employee1).
		// Notar que las colecciones en Java comienzan en la posici�n 0.
		assertEquals(employees.get(0), employee1);

		// Obtengo el segundo elemento de la lista y chequeo que sea el segundo que agregu� (employee2).
		assertEquals(employees.get(1), employee2);
		
		// Obtengo el tercer elemento de la lista y chequeo que sea el tercero que agregu� (employee3).
		assertEquals(employees.get(2), employee3);
	}

	
	/**
	 * Muestra el funcionamiento de la consulta de existencia de un elemento en la lista.
	 */
	@Test
	public void testContanins() {
		
		// Consulto si la lista contiene al elemento.
		boolean existentEmployee = employees.contains(employee2);
		
		// Realizo el assert.
		assertTrue(existentEmployee);
	}

	
	/**
	 * Muestra el funcionamiento del borrado del �ltimo elemento de la lista.
	 */
	@Test
	public void testRemoveLast() {

		// Elimino el elemento que se encuentra en el �ltimo lugar de la lista.
		// Recordar que la primera posici�n es la cero.
		int index = employees.size() - 1;
		employees.remove(index);
		
		// Chequeo que la lista contenga un empleado menos.
		assertEquals(employees.size(),2);
	}

	
	/**
	 * Muestra el funcionamiento del borrado de un elemento intermedio en la lista.
	 */
	@Test
	public void testRemoveMiddle() {

		// Elimino el elemento que se encuentra en la posici�n media de la lista (employee2).
		// Recordar que la primera posici�n es la cero.
		int index = 1;
		employees.remove(index);
		
		// Chequeo que la lista contenga un empleado menos.
		assertEquals(employees.size(), 2);
		
		// Chequeo que, ahora, el primer y tercer empleados agregados originalmente
		// est�n en posiciones consecutivas (primera y segunda posici�n en la lista).
		assertEquals(employees.get(0), employee1);
		assertEquals(employees.get(1), employee3);		
	}
	
	
	/**
	 * Muestra el agregado de un elemento en una posici�n determinada de la lista (y no 
	 * al final, como es por default).
	 */
	@Test
	public void testAddAtIndex() {

		// Defino y creo un nuevo empleado.
		Employee employee4 = new Employee("Adriana", "Cisneros", 4000.0);
		
		// Agrego el empleado en la segunda posici�n de la lista (lo cual genera un 
		// desplazamiento de los elementos ya contenidos en ella).
		employees.add(1, employee4);
		
		// Chequeo que la lista contenga un empleado m�s.
		assertEquals(employees.size(), 4);
		
		// Chequeo que el orden de los cuatro empleados en la lista sea el esperado, es decir:
		// el reci�n creado en la segunda posici�n, habiendo desplazado a dos empleados originales.
		assertEquals(employees.get(0), employee1);
		assertEquals(employees.get(1), employee4);		
		assertEquals(employees.get(2), employee2);
		assertEquals(employees.get(3), employee3);
	}

	
	/**
	 * Muestra el funcionamiento del chequeo por lista vac�a.
	 */
	@Test
	public void testEmptyCollection() {

		// Elimino todos los elementos de la lista.
		employees.clear();
		
		// Chequeo si la lista est� vac�a.
		boolean empty = employees.isEmpty();

		// Realizo el assert.
		assertTrue(empty);
	}
	
	/**
	 * Muestra el funcionamiento del filtrado de una collecci�n con Lambda Expressions. Similar al select: de Smalltalk
	 */
	@Test
	public void testFilterCollection() {

		List<Employee> filteredEmployees = employees.stream().filter(employee -> employee.getFinalIncome() > 1500.0).collect(Collectors.toList());
		
		// Chequeo si la lista tiene 2 empleados.
		assertEquals(filteredEmployees.size(),2);
	}
	
	/**
	 * Muestra el funcionamiento del calculo de la suma de una collecci�n con Lambda Expressions. Similar al sum: de SmallTalk.
	 */
	@Test
	public void testSum() {

		Double totalIncomes = employees
			    .stream()
			    .mapToDouble(Employee::getFinalIncome)
			    .sum();
		// Chequeo si la suma de los salarios es 5100.
		assertEquals(totalIncomes.floatValue(),5100f,0f);
	}
	
	/**
	 * Muestra el funcionamiento de la iteracion de una collecci�n con Lambda Expressions. Similar al do: de SmallTalk.
	 */
	@Test
	public void testForEach() {

		employees.stream().forEach(employee -> employee.increaseIncome(10.0));
		
		Double totalIncomes = employees
			    .stream()
			    .mapToDouble(Employee::getFinalIncome)
			    .sum();
		// Chequeo si la suma de los salarios es 5610.
		assertEquals(totalIncomes.floatValue(),5610f,0f);
	}
	
	/**
	 * Muestra el funcionamiento del calculo del promedio de una collecci�n con Lambda Expressions. Similar al average de SmallTalk.
	 */
	@Test
	public void testAverage() {

		Double totalIncomes = employees
			    .stream()
			    .mapToDouble(Employee::getFinalIncome)
			    .average().getAsDouble();
		// Chequeo si la suma de los salarios es 5100.
		assertEquals(totalIncomes.floatValue(),1700f,0f);
	}
	
	/**
	 * Muestra el funcionamiento de la obtenci�n del m�nimo o m�ximo de una collecci�n con Lambda Expressions. Similar al detectMax o detectMin de SmallTalk.
	 */
	@Test
	public void testMinMax() {

		Employee employeeWithHighestSalary = employees.stream().max((Employee e1, Employee e2)->e1.getFinalIncome().compareTo(e2.getFinalIncome())).get();
		Employee employeeWithLowestSalary = employees.stream().min((Employee e1, Employee e2)->e1.getFinalIncome().compareTo(e2.getFinalIncome())).get();
		// Chequeo si la suma de los salarios es 5100.
		assertEquals(employeeWithHighestSalary, employee3);
		assertEquals(employeeWithLowestSalary, employee1);
	}
	
	/**
	 * Muestra el funcionamiento de la ordenaci�n de una collecci�n con Lambda Expressions. Similar al sort: de SmallTalk.
	 */
	@Test
	public void testSort() {

		Collections.sort(employees,(Employee e1, Employee e2)->e1.getFinalIncome().compareTo(e2.getFinalIncome()));
		
		assertEquals(employees.get(0), employee1);
		assertEquals(employees.get(1), employee2);
		assertEquals(employees.get(2), employee3);
		
		//Ordeno en el orden inverso
		Collections.sort(employees,(Employee e1, Employee e2)->e2.getFinalIncome().compareTo(e1.getFinalIncome()));
		
		assertEquals(employees.get(0), employee3);
		assertEquals(employees.get(1), employee2);
		assertEquals(employees.get(2), employee1);
	}
	/**
	 * Muestra el funcionamiento de la b�squeda del primer objeto que cumple con un predicado con Lambda Expressions. Similar al detect: de SmallTalk.
	 */
	@Test
	public void testFindFirst() {
		Employee firstEmployee = employees.stream().filter(employee -> employee.getFinalIncome() > 2000.0)
			    .findFirst().get();
		
		assertEquals(firstEmployee, employee3);
	}

}



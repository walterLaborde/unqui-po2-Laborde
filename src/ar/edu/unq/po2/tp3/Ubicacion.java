package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Ubicacion {

	private double latitud;
	private double longitud;
	
	public Ubicacion(double latitud, double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public double distanciaHacia(Ubicacion ubicacion1) {
		double lats = Math.pow(ubicacion1.getLatitud() - this.getLatitud(), 2);
		double longs = Math.pow(ubicacion1.getLongitud() - this.getLongitud(), 2);
		double distancia = Math.sqrt(lats + longs)*100;
		
		return distancia;
	}
	
	
	public ArrayList<Ubicacion> ubicacionesCercanasRespectoA(ArrayList<Ubicacion> ubicaciones, double km) {
		ArrayList<Ubicacion> ubicacionesCercanas = new ArrayList<Ubicacion>();
		for (Ubicacion ubicacion: ubicaciones) {
			if (distanciaHacia(ubicacion) < km) {
				ubicacionesCercanas.add(ubicacion);
			}
		}		
		return ubicacionesCercanas;
	}
	
	
	public ArrayList<Muestra> muestrasCercanasRespectoA(Muestra muestra, double km) {
		ArrayList<Muestra> muestrasCercanas = new ArrayList<Muestra>();
		//for (Muestra muestra : RegistroDeMuestras	)
		// Esta en construcción.
		
		return muestrasCercanas;
	}
	

}

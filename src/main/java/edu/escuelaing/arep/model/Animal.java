package edu.escuelaing.arep.model;

/**
 * Clase Animal que mostrara informacion de un animal
 * @author SebastianPaez
 *
 */
public class Animal {
	private String marca;
	private String nombre;
	private int numero;
	
	
	/**
	 * Construye un animal a partir de los parametros dados
	 * @param marca Es el tipo de animal
	 * @param nombre Es el nombre del animal
	 * @param numero Es la edad del animal
	 */
	public Animal (String marca, String nombre, int numero) {
		this.setanimal(marca);
		this.setNombre(nombre);
		this.setNumero(numero);
	}

	
	/**
	 * Retorna el tipo de animal
	 * @return animal 
	 */
	public String getanimal() {
		return marca;
	}

	/**
	 * Cambia el tipo de animal
	 * @param animal Es el nuevo tipo
	 */
	public void setanimal(String animal) {
		this.marca = animal;
	}

	/**
	 * Retorna el nombre del animal
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre del animal
	 * @param nombre Es el nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * Retorna la edad del animal
	 * @return edad
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Cambia la edad del animal
	 * @param numero Es la nueva edad
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * Retorna las caracteristicas del animal en formato JSON
	 */
	public String toString() {
		return "{\"marca\": " + "\"" + marca +  "\"" + ", \"nombre\": " + "\"" + nombre +  "\"" + ", \"numero\": " + numero + "}";
	}
}

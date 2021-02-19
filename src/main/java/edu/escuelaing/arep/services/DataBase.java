package edu.escuelaing.arep.services;

import java.util.HashMap;

import org.bson.Document;

import edu.escuelaing.arep.model.Animal;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * 
 * @author Nikolai Bermudez V
 */
public class DataBase {

	private MongoCollection<org.bson.Document> columnas;


	/**
	 * Realiza la conexi�n con la base de datos
	 */
	public DataBase() {
		MongoClient mongoClient = new MongoClient( new MongoClientURI("mongodb://admin:1234@clusterareplab3-shard-00-00.dcoua.mongodb.net:27017,clusterareplab3-shard-00-01.dcoua.mongodb.net:27017,clusterareplab3-shard-00-02.dcoua.mongodb.net:27017/animals?ssl=true&replicaSet=atlas-5kfmsp-shard-0&authSource=admin&retryWrites=true&w=majority"));
		MongoDatabase database = mongoClient.getDatabase("animals");
		columnas = database.getCollection("pets");
	}


	/**
	 * A�ade un animal a la base de daots
	 * @param a Es el nuevo animal a a�adir
	 */
	public void addAnimal(Animal a) {
		HashMap<String, Object> map = new HashMap<>();
		String animal = a.getanimal();
		String nombre = a.getNombre();
		int edad = a.getEdad();
		map.put("animal", animal);
		map.put("nombre", nombre);
		map.put("edad", edad);
		Document registro = new Document(map);
		columnas.insertOne(registro);
	}


	/**
	 * Consulta todos los animales de la base de datos
	 * @return Una lista en formato JSON con los animales
	 */
	public String getAnimals() {
		String data ="[  ";
		Animal animal;
		for (Document d : columnas.find()) {
			animal = new Animal(d.get("animal").toString(), d.get("nombre").toString(), Integer.parseInt(d.get("edad").toString()));
			data += animal.toString() + ", ";
		}
		data = data.substring(0, data.length() - 2);
		data += "]";
		return data;
	}


}
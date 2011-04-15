package util;


import java.util.ArrayList;
import java.util.List;

import play.jobs.Job;
import static util.Constant.*;
import play.jobs.OnApplicationStart;
import models.Product;

public class DataBaseLoader {

	public void load() {
		List<Product> vegetables = createVegetablesList();
		persist(vegetables);
		
		List<Product> fruits = createFruitsList();
		persist(fruits);
		
		List<Product> miscellaneous = createMiscellaneousList();
		persist(miscellaneous);
	}

	private List<Product> createVegetablesList() {
		List <Product> vegetables = new ArrayList<Product>() ;
		
		Product product = null;
		
		product = new Product("Ajos", VEGETABLE);
		vegetables.add(product);
		
		product = new Product("Alcachofas", VEGETABLE);
		product.imageName = "artichoke.jpg";
		vegetables.add(product);
		
		product = new Product("Berenjena morada", VEGETABLE);
		vegetables.add(product);
		
		product = new Product("Berenjenas blanca", VEGETABLE);
		vegetables.add(product);
		
		product = new Product("Boniatos - Batata", VEGETABLE);
		product.imageName = "sweet-potato.jpg";
		vegetables.add(product);
		
		product = new Product("Calabaza" , VEGETABLE);
		product.imageName = "pumpking.jpg";
		vegetables.add(product);
		
		product = new Product("Cebollas", VEGETABLE);
		product.imageName = "onion.jpg";
		vegetables.add(product);
		
		product = new Product("Coles", VEGETABLE);
		product.imageName = "kale.jpg";
		vegetables.add(product);
		
		product = new Product("Coliflor", VEGETABLE);
		vegetables.add(product);
		
		product = new Product("Patata", VEGETABLE);
		product.imageName = "potato.jpg";
		vegetables.add(product);
		
		product = new Product("Pimiento rojo", VEGETABLE);
		vegetables.add(product);
		
		product = new Product("Pimiento rubio", VEGETABLE);
		vegetables.add(product);
		
		product = new Product("Sofrito - Ajos Tiernos", VEGETABLE);
		vegetables.add(product);
		
		product = new Product("Tomate de pera", VEGETABLE);
		vegetables.add(product);
		
		product = new Product("Tomate de ramallet", VEGETABLE);
		vegetables.add(product);
		return vegetables;
	}

	private List<Product> createFruitsList() {
		List <Product> fruits = new ArrayList<Product>() ;
		
		Product product = null;
		
		product = new Product("Albaricoque", FRUIT);
		fruits.add(product);
		
		product = new Product("Granadas", FRUIT);
		fruits.add(product);
		
		product = new Product("Melón", FRUIT);
		product.imageName = "melon.jpg";
		fruits.add(product);
		
		product = new Product("Sandía", FRUIT);
		fruits.add(product);
		
		return fruits;
	}
	
	public List<Product> createMiscellaneousList(){
		List <Product> miscellaneous = new ArrayList<Product>();
		Product product = null;
		
		product = new Product("Almendras con cascara", MISCELLANY);
		miscellaneous.add(product);
		
		product = new Product("Habas" , MISCELLANY);
		miscellaneous.add(product);
		
		product = new Product("Judia cilena" , MISCELLANY);
		miscellaneous.add(product);
		
		product = new Product("Gallina" , MISCELLANY);
		miscellaneous.add(product);
		
		product = new Product("Huevos" , MISCELLANY);
		product.imageName = "egg.jpg";
		miscellaneous.add(product);
		
		product = new Product("Pollo" , MISCELLANY);
		miscellaneous.add(product);
		
		return miscellaneous;
	}
	public void persist (List<Product> products){
		for (Product product : products) {
			product.insert();
		}
	}

}
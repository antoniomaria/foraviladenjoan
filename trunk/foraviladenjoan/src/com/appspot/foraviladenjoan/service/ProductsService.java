package com.appspot.foraviladenjoan.service;

import java.util.ArrayList;
import java.util.List;

import com.appspot.foraviladenjoan.busines.Product;

public class ProductsService {

	public List <Product> findVegetables(){
		List <Product> vegetables = new ArrayList<Product>();
		Product product = null;
		
		product = new Product("Ajos");
		vegetables.add(product);
		
		product = new Product("Alcachofas");
		product.setImagePath("artichoke.jpg");
		vegetables.add(product);
		
		product = new Product("Berenjena morada");
		vegetables.add(product);
		product = new Product("Berenjenas blanca");
		vegetables.add(product);
		product = new Product("Boniatos - Batata");
		product.setImagePath("sweet-potato.jpg");
		vegetables.add(product);
		
		product = new Product("Calabaza");
		product.setImagePath("pumpking.jpg");
		vegetables.add(product);
		
		product = new Product("Cebollas");
		product.setImagePath("onion.jpg");
		vegetables.add(product);
		
		product = new Product("Coles");
		product.setImagePath("kale.jpg");
		vegetables.add(product);
		
		product = new Product("Patata");
		product.setImagePath("potato.jpg");
		vegetables.add(product);
		
		product = new Product("Pimiento rojo");
		vegetables.add(product);
		product = new Product("Pimiento rubio");
		vegetables.add(product);
		product = new Product("Sofrito - Ajos Tiernos");
		vegetables.add(product);
		product = new Product("Tomate de pera");
		vegetables.add(product);
		product = new Product("Tomate de ramallet");
		vegetables.add(product);
		return vegetables;
	}
	
	public List <Product> findFruits(){
		List <Product> fruits = new ArrayList<Product>();
		Product product = null;
		
		product = new Product("Albaricoque");
		fruits.add(product);
		
		product = new Product("Granadas");
		fruits.add(product);
		
		product = new Product("Melón");
		product.setImagePath("melon.jpg");
		fruits.add(product);
		
		product = new Product("Sandía");
		fruits.add(product);
		
		return fruits;
	}
	
	public List <Product> findMiscellaneous(){
		List <Product> miscellaneous = new ArrayList<Product>();
		Product product = null;
		
		product = new Product("Almendras con cascara");
		miscellaneous.add(product);
		
		product = new Product("Habas");
		miscellaneous.add(product);
		
		product = new Product("Judia cilena");
		miscellaneous.add(product);
		
		product = new Product("Gallina");
		miscellaneous.add(product);
		
		product = new Product("Huevos");
		product.setImagePath("egg.jpg");
		miscellaneous.add(product);
		
		product = new Product("Pollo");
		miscellaneous.add(product);
		
		return miscellaneous;
	}
}

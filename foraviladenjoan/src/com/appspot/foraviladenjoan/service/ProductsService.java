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
		product = new Product("Boniatos - Batata)");
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
}

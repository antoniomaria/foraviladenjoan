package com.appspot.foraviladenjoan.service;

import java.util.ArrayList;
import java.util.List;

import com.appspot.foraviladenjoan.busines.ProductInfo;

public class ProductsService {

	public List <ProductInfo> findVegetables(){
		List <ProductInfo> vegetables = new ArrayList<ProductInfo>();
		ProductInfo product = null;
		
		product = new ProductInfo("Ajos");
		//vegetables.add(product);
		
		product = new ProductInfo("Alcachofas");
		product.setImagePath("artichoke.jpg");
		//vegetables.add(product);
		
		product = new ProductInfo("Berenjena morada");
		//vegetables.add(product);
		product = new ProductInfo("Berenjenas blanca");
		//vegetables.add(product);
		product = new ProductInfo("Boniatos - Batata");
		product.setImagePath("sweet-potato.jpg");
		//vegetables.add(product);
		
		product = new ProductInfo("Calabaza");
		product.setImagePath("pumpking.jpg");
		//vegetables.add(product);
		
		product = new ProductInfo("Cebollas");
		product.setImagePath("onion.jpg");
		//vegetables.add(product);
		
		product = new ProductInfo("Coles");
		product.setImagePath("kale.jpg");
		vegetables.add(product);
		
		product = new ProductInfo("Coliflor");
		//vegetables.add(product);
		
		product = new ProductInfo("Patata");
		product.setImagePath("potato.jpg");
		//vegetables.add(product);
		
		product = new ProductInfo("Pimiento rojo");
		//vegetables.add(product);
		product = new ProductInfo("Pimiento rubio");
		//vegetables.add(product);
		product = new ProductInfo("Sofrito - Ajos Tiernos");
		vegetables.add(product);
		product = new ProductInfo("Tomate de pera");
		//vegetables.add(product);
		product = new ProductInfo("Tomate de ramallet");
		//vegetables.add(product);
		return vegetables;
	}
	
	public List <ProductInfo> findFruits(){
		List <ProductInfo> fruits = new ArrayList<ProductInfo>();
		ProductInfo product = null;
		
		product = new ProductInfo("Albaricoque");
		//fruits.add(product);
		
		product = new ProductInfo("Granadas");
		//fruits.add(product);
		
		product = new ProductInfo("Melón");
		product.setImagePath("melon.jpg");
		//fruits.add(product);
		
		product = new ProductInfo("Sandía");
		fruits.add(product);
		
		return fruits;
	}
	
	public List <ProductInfo> findMiscellaneous(){
		List <ProductInfo> miscellaneous = new ArrayList<ProductInfo>();
		ProductInfo product = null;
		
		product = new ProductInfo("Almendras con cascara");
		miscellaneous.add(product);
		
		product = new ProductInfo("Habas");
		//miscellaneous.add(product);
		
		product = new ProductInfo("Judia cilena");
		//miscellaneous.add(product);
		
		product = new ProductInfo("Gallina");
		//miscellaneous.add(product);
		
		product = new ProductInfo("Huevos");
		product.setImagePath("egg.jpg");
		miscellaneous.add(product);
		
		product = new ProductInfo("Pollo");
		//miscellaneous.add(product);
		
		return miscellaneous;
	}
}

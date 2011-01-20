package com.appspot.foraviladenjoan.util;

import java.util.List;

import com.appspot.foraviladenjoan.busines.Product;
import com.appspot.foraviladenjoan.mvc.Item;
import com.appspot.foraviladenjoan.mvc.ItemCollection;

public class ConvertUtil {
	
	public static ItemCollection toTable(List<Product> products){
		ItemCollection table = new ItemCollection();
		
		ItemCollection row = null;
		int i = 0;
		for (Product product : products) {
			if (i % 5 == 0){
				row = new ItemCollection();
				table.add(row);
			}
			Item pItem = new Item();
			pItem.put("name", product.getName());
			pItem.put("cost", product.getCost());
			pItem.put("unit", product.getUnit());
			pItem.put("available", product.isAvailable());
			pItem.put("imagePath", product.getImagePath());
			row.add(pItem);
			i++;
		}
		return table;
	}

}

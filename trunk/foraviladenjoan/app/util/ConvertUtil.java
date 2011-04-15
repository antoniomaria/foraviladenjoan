package util;

import java.util.List;

import models.Product;


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
			pItem.put("name", product.name);
			pItem.put("cost", product.cost);
			pItem.put("unit", product.unit);
			pItem.put("available", product.available);
			pItem.put("imageName", product.imageName);
			row.add(pItem);
			i++;
		}
		
		for (IItem irow : table) {
			ItemCollection xrow = (ItemCollection) (irow);
			for (int j = xrow.size() ; j <= 4; j ++){
				xrow.add(new Item());
			}
			
		}
		return table;
	}

}

package com.appspot.foraviladenjoan.util;

import java.util.List;

import com.appspot.foraviladenjoan.busines.ProductInfo;
import com.appspot.foraviladenjoan.mvc.IItem;
import com.appspot.foraviladenjoan.mvc.Item;
import com.appspot.foraviladenjoan.mvc.ItemCollection;

public class ConvertUtil {
	
	public static ItemCollection toTable(List<ProductInfo> products){
		ItemCollection table = new ItemCollection();
		
		ItemCollection row = null;
		int i = 0;
		for (ProductInfo product : products) {
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
		
		for (IItem irow : table) {
			ItemCollection xrow = (ItemCollection) (irow);
			for (int j = xrow.size() ; j <= 4; j ++){
				xrow.add(new Item());
			}
			
		}
		return table;
	}

}

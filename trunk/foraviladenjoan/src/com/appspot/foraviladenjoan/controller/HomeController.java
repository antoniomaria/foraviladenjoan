package com.appspot.foraviladenjoan.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.appspot.foraviladenjoan.busines.Product;
import com.appspot.foraviladenjoan.mvc.IItem;
import com.appspot.foraviladenjoan.mvc.Item;
import com.appspot.foraviladenjoan.mvc.ItemCollection;
import com.appspot.foraviladenjoan.mvc.ModelAndView;
import com.appspot.foraviladenjoan.service.ProductsService;
import java.util.logging.Logger;

public class HomeController extends BaseController {

	private static final long serialVersionUID = -5963950303402877560L;
	private static final Logger logger = Logger.getLogger(HomeController.class
			.getName());

	public HomeController() {
		super();
	}

	@Override
	public ModelAndView onShowForm(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> model = new HashMap<String, Object>();

		ProductsService service = new ProductsService();

		List<Product> vegetables = service.findVegetables();
		ItemCollection table = new ItemCollection();
		
		ItemCollection row = null;
		int i = 0;
		for (Product product : vegetables) {
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
		model.put("vegetables", table);

		return new ModelAndView(model, "/WEB-INF/views/home.jsp");
	}

}

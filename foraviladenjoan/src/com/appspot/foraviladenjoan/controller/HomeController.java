package com.appspot.foraviladenjoan.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.appspot.foraviladenjoan.busines.ProductInfo;
import com.appspot.foraviladenjoan.mvc.ModelAndView;
import com.appspot.foraviladenjoan.service.ProductsService;
import com.appspot.foraviladenjoan.util.ConvertUtil;

public class HomeController extends BaseController {

	private static final long serialVersionUID = -5963950303402877560L;
	public static final Logger logger = Logger.getLogger(HomeController.class
			.getName());

	public HomeController() {
		super();
	}

	@Override
	public ModelAndView onShowForm(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> model = new HashMap<String, Object>();

		ProductsService service = new ProductsService();

		List<ProductInfo> vegetables = service.findVegetables();
		
		List<ProductInfo> fruits = service.findFruits();
		
		List<ProductInfo> miscellaneus = service.findMiscellaneous();
		
		model.put("vegetables", ConvertUtil.toTable(vegetables));
		model.put("fruits", ConvertUtil.toTable(fruits));
		model.put("miscellaneus", ConvertUtil.toTable(miscellaneus));

		return new ModelAndView(model, "/WEB-INF/views/home.jsp");
	}

}
